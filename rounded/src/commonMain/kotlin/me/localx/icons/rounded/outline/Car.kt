package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Car: ImageVector
    get() {
        if (_car != null) {
            return _car!!
        }
        _car = Builder(name = "Car", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9f, 4.291f)
                arcTo(5.011f, 5.011f, 0.0f, false, false, 16.2f, 1.0f)
                lineTo(7.8f, 1.0f)
                arcTo(5.011f, 5.011f, 0.0f, false, false, 3.1f, 4.291f)
                lineTo(0.4f, 11.718f)
                arcTo(6.664f, 6.664f, 0.0f, false, false, 0.0f, 14.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(4.979f, 4.979f, 0.0f, false, false, 2.0f, 3.978f)
                curveToRelative(0.0f, 0.008f, 0.0f, 0.014f, 0.0f, 0.022f)
                verticalLineToRelative(2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                lineTo(8.0f, 20.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                lineTo(22.0f, 19.0f)
                curveToRelative(0.0f, -0.008f, 0.0f, -0.014f, 0.0f, -0.022f)
                arcTo(4.979f, 4.979f, 0.0f, false, false, 24.0f, 15.0f)
                lineTo(24.0f, 14.0f)
                arcToRelative(6.654f, 6.654f, 0.0f, false, false, -0.4f, -2.281f)
                close()
                moveTo(4.982f, 4.975f)
                arcTo(3.009f, 3.009f, 0.0f, false, true, 7.8f, 3.0f)
                horizontalLineToRelative(8.4f)
                arcToRelative(3.009f, 3.009f, 0.0f, false, true, 2.82f, 1.975f)
                lineTo(21.208f, 11.0f)
                lineTo(2.791f, 11.0f)
                close()
                moveTo(6.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(4.0f, 19.9f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 5.0f, 20.0f)
                lineTo(6.0f, 20.0f)
                close()
                moveTo(20.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(18.0f, 20.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 1.0f, -0.1f)
                close()
                moveTo(22.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(5.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                lineTo(2.0f, 14.0f)
                arcToRelative(4.659f, 4.659f, 0.0f, false, true, 0.121f, -1.0f)
                lineTo(4.0f, 13.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(6.0f, 13.0f)
                lineTo(18.0f, 13.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(20.0f, 13.0f)
                horizontalLineToRelative(1.879f)
                arcTo(4.652f, 4.652f, 0.0f, false, true, 22.0f, 14.0f)
                close()
            }
        }
        .build()
        return _car!!
    }

private var _car: ImageVector? = null
