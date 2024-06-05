package me.localx.icons.rounded.filled

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

public val Icons.Filled.UpRightFromSquare: ImageVector
    get() {
        if (_upRightFromSquare != null) {
            return _upRightFromSquare!!
        }
        _upRightFromSquare = Builder(name = "UpRightFromSquare", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.761f, -2.239f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.761f, 0.0f, -5.0f, -2.239f, -5.0f, -5.0f)
                lineTo(0.0f, 5.0f)
                curveTo(0.0f, 2.239f, 2.239f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(1.758f)
                lineTo(7.086f, 12.672f)
                curveToRelative(-1.171f, 1.171f, -1.172f, 3.071f, 0.0f, 4.242f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.171f, 1.172f, 3.071f, 1.172f, 4.243f, 0.0f)
                lineToRelative(8.672f, -8.672f)
                verticalLineToRelative(1.758f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(21.0f, 0.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.586f)
                lineToRelative(-12.086f, 12.086f)
                curveToRelative(-0.391f, 0.39f, -0.391f, 1.024f, 0.0f, 1.414f)
                curveToRelative(0.391f, 0.39f, 1.024f, 0.39f, 1.414f, 0.0f)
                lineTo(22.0f, 3.414f)
                verticalLineToRelative(6.586f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _upRightFromSquare!!
    }

private var _upRightFromSquare: ImageVector? = null
