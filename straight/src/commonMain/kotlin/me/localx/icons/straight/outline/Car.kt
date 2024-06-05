package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

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
                moveTo(20.418f, 2.975f)
                arcTo(3.008f, 3.008f, 0.0f, false, false, 17.6f, 1.0f)
                lineTo(6.4f, 1.0f)
                arcTo(3.008f, 3.008f, 0.0f, false, false, 3.582f, 2.975f)
                lineTo(1.438f, 8.869f)
                arcTo(23.785f, 23.785f, 0.0f, false, false, 0.0f, 17.031f)
                lineTo(0.0f, 19.0f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(4.0f)
                lineTo(8.0f, 23.0f)
                lineTo(8.0f, 19.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(6.0f)
                lineTo(22.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 17.031f)
                arcToRelative(23.785f, 23.785f, 0.0f, false, false, -1.438f, -8.162f)
                close()
                moveTo(5.461f, 3.658f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.4f, 3.0f)
                lineTo(17.6f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.939f, 0.658f)
                lineToRelative(2.144f, 5.9f)
                curveToRelative(0.173f, 0.477f, 0.317f, 0.962f, 0.456f, 1.447f)
                lineTo(2.861f, 11.005f)
                curveToRelative(0.139f, -0.485f, 0.283f, -0.97f, 0.456f, -1.447f)
                close()
                moveTo(6.0f, 21.0f)
                lineTo(4.0f, 21.0f)
                lineTo(4.0f, 19.0f)
                lineTo(6.0f, 19.0f)
                close()
                moveTo(20.0f, 21.0f)
                lineTo(18.0f, 21.0f)
                lineTo(18.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(2.0f, 17.0f)
                arcToRelative(21.9f, 21.9f, 0.0f, false, true, 0.382f, -4.0f)
                lineTo(4.0f, 13.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                lineTo(5.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(6.0f, 13.0f)
                lineTo(18.0f, 13.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(20.0f, 13.0f)
                horizontalLineToRelative(1.618f)
                arcTo(21.9f, 21.9f, 0.0f, false, true, 22.0f, 17.0f)
                close()
            }
        }
        .build()
        return _car!!
    }

private var _car: ImageVector? = null
