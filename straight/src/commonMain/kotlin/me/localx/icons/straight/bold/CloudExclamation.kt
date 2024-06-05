package me.localx.icons.straight.bold

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

public val Icons.Bold.CloudExclamation: ImageVector
    get() {
        if (_cloudExclamation != null) {
            return _cloudExclamation!!
        }
        _cloudExclamation = Builder(name = "CloudExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(17.615f, 6.171f)
                curveToRelative(-1.3f, -3.087f, -4.274f, -5.171f, -7.524f, -5.171f)
                curveTo(5.554f, 1.0f, 2.0f, 4.514f, 2.0f, 9.0f)
                curveToRelative(0.0f, 0.575f, 0.081f, 1.511f, 0.213f, 2.37f)
                curveToRelative(-1.387f, 1.128f, -2.213f, 2.819f, -2.213f, 4.63f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                curveToRelative(0.0f, -1.088f, 0.607f, -2.093f, 1.585f, -2.622f)
                lineToRelative(1.017f, -0.55f)
                lineToRelative(-0.273f, -1.124f)
                curveToRelative(-0.182f, -0.75f, -0.329f, -2.093f, -0.329f, -2.704f)
                curveToRelative(0.0f, -2.851f, 2.188f, -5.0f, 5.091f, -5.0f)
                curveToRelative(2.167f, 0.0f, 4.223f, 1.595f, 4.935f, 3.81f)
                lineToRelative(0.129f, 1.116f)
                lineToRelative(1.233f, 0.095f)
                curveToRelative(2.586f, 0.199f, 4.612f, 2.387f, 4.612f, 4.979f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(4.411f, 0.0f, 8.0f, -3.589f, 8.0f, -8.0f)
                curveToRelative(0.0f, -3.812f, -2.733f, -7.074f, -6.385f, -7.829f)
                close()
                moveTo(10.0f, 17.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _cloudExclamation!!
    }

private var _cloudExclamation: ImageVector? = null
