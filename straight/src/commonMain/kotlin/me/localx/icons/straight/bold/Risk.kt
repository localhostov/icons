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

public val Icons.Bold.Risk: ImageVector
    get() {
        if (_risk != null) {
            return _risk!!
        }
        _risk = Builder(name = "Risk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 12.0f)
                curveToRelative(0.0f, -1.285f, -0.252f, -2.51f, -0.696f, -3.64f)
                lineToRelative(1.838f, -1.061f)
                lineToRelative(-1.5f, -2.598f)
                lineToRelative(-1.839f, 1.062f)
                curveToRelative(-1.537f, -1.919f, -3.765f, -3.253f, -6.303f, -3.638f)
                lineTo(13.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.125f)
                curveToRelative(-2.539f, 0.385f, -4.766f, 1.719f, -6.303f, 3.638f)
                lineToRelative(-1.839f, -1.062f)
                lineToRelative(-1.5f, 2.598f)
                lineToRelative(1.838f, 1.061f)
                curveToRelative(-0.444f, 1.13f, -0.696f, 2.355f, -0.696f, 3.64f)
                reflectiveCurveToRelative(0.252f, 2.51f, 0.696f, 3.64f)
                lineToRelative(-1.838f, 1.061f)
                lineToRelative(1.5f, 2.598f)
                lineToRelative(1.839f, -1.062f)
                curveToRelative(1.537f, 1.919f, 3.765f, 3.253f, 6.303f, 3.638f)
                verticalLineToRelative(2.125f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.125f)
                curveToRelative(2.539f, -0.385f, 4.766f, -1.719f, 6.303f, -3.638f)
                lineToRelative(1.839f, 1.062f)
                lineToRelative(1.5f, -2.598f)
                lineToRelative(-1.838f, -1.061f)
                curveToRelative(0.444f, -1.13f, 0.696f, -2.355f, 0.696f, -3.64f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(3.86f, 0.0f, 7.0f, 3.141f, 7.0f, 7.0f)
                curveToRelative(0.0f, 1.396f, -0.416f, 2.696f, -1.123f, 3.789f)
                lineToRelative(-5.877f, -10.075f)
                lineToRelative(-5.877f, 10.075f)
                curveToRelative(-0.708f, -1.094f, -1.123f, -2.393f, -1.123f, -3.789f)
                curveToRelative(0.0f, -3.859f, 3.14f, -7.0f, 7.0f, -7.0f)
                close()
                moveTo(11.0f, 12.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(13.0f, 13.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-2.372f, 0.0f, -4.47f, -1.189f, -5.736f, -3.0f)
                horizontalLineToRelative(11.472f)
                curveToRelative(-1.267f, 1.811f, -3.364f, 3.0f, -5.736f, 3.0f)
                close()
            }
        }
        .build()
        return _risk!!
    }

private var _risk: ImageVector? = null
