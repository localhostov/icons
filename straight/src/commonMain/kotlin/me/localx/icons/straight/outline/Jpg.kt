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

public val Icons.Outline.Jpg: ImageVector
    get() {
        if (_jpg != null) {
            return _jpg!!
        }
        _jpg = Builder(name = "Jpg", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(18.414f, 24.0f)
                lineTo(24.0f, 18.414f)
                lineTo(24.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 0.0f)
                close()
                moveTo(18.0f, 21.586f)
                lineTo(18.0f, 18.0f)
                horizontalLineToRelative(3.586f)
                close()
                moveTo(22.0f, 16.0f)
                lineTo(16.0f, 16.0f)
                verticalLineToRelative(6.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 2.0f)
                lineTo(21.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
                moveTo(10.967f, 5.0f)
                lineTo(9.0f, 5.0f)
                verticalLineToRelative(6.069f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-2.1f)
                lineToRelative(0.717f, 0.0f)
                arcToRelative(1.985f, 1.985f, 0.0f, true, false, 0.0f, -3.97f)
                close()
                moveTo(10.967f, 7.72f)
                lineTo(10.257f, 7.72f)
                lineTo(10.257f, 6.247f)
                horizontalLineToRelative(0.715f)
                arcToRelative(0.735f, 0.735f, 0.0f, true, true, 0.0f, 1.47f)
                close()
                moveTo(15.251f, 7.0f)
                lineTo(15.251f, 9.068f)
                arcTo(0.742f, 0.742f, 0.0f, false, false, 16.0f, 9.819f)
                arcToRelative(0.759f, 0.759f, 0.0f, false, false, 0.75f, -0.735f)
                lineTo(16.75f, 9.0f)
                lineTo(16.0f, 9.0f)
                lineTo(16.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                lineTo(18.0f, 9.084f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 1.984f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.991f, 1.991f, 0.0f, false, true, -2.0f, -1.985f)
                verticalLineToRelative(-2.1f)
                arcTo(1.991f, 1.991f, 0.0f, false, true, 16.0f, 5.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.013f, 2.013f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(16.75f, 7.0f)
                arcTo(0.772f, 0.772f, 0.0f, false, false, 16.0f, 6.25f)
                arcTo(0.742f, 0.742f, 0.0f, false, false, 15.251f, 7.0f)
                close()
                moveTo(6.75f, 5.0f)
                lineTo(8.0f, 5.0f)
                lineTo(8.0f, 9.084f)
                arcToRelative(1.991f, 1.991f, 0.0f, false, true, -2.0f, 1.985f)
                lineTo(6.0f, 11.069f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 9.084f)
                lineTo(4.0f, 9.0f)
                lineTo(5.255f, 9.0f)
                reflectiveCurveToRelative(0.0f, 0.054f, 0.0f, 0.084f)
                arcTo(0.759f, 0.759f, 0.0f, false, false, 6.0f, 9.819f)
                arcToRelative(0.742f, 0.742f, 0.0f, false, false, 0.749f, -0.751f)
                close()
            }
        }
        .build()
        return _jpg!!
    }

private var _jpg: ImageVector? = null
