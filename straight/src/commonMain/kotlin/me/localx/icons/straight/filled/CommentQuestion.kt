package me.localx.icons.straight.filled

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

public val Icons.Filled.CommentQuestion: ImageVector
    get() {
        if (_commentQuestion != null) {
            return _commentQuestion!!
        }
        _commentQuestion = Builder(name = "CommentQuestion", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(12.0f)
                lineTo(24.0f, 12.0f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(13.0f, 19.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.928f, 12.505f)
                curveToRelative(-0.468f, 0.259f, -0.928f, 1.126f, -0.928f, 1.752f)
                verticalLineToRelative(0.743f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.743f)
                curveToRelative(0.0f, -1.189f, 0.734f, -2.825f, 1.962f, -3.503f)
                curveToRelative(0.764f, -0.421f, 1.158f, -1.255f, 1.005f, -2.125f)
                curveToRelative(-0.138f, -0.786f, -0.81f, -1.458f, -1.597f, -1.596f)
                curveToRelative(-0.606f, -0.107f, -1.194f, 0.047f, -1.655f, 0.434f)
                curveToRelative(-0.455f, 0.382f, -0.715f, 0.94f, -0.715f, 1.533f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.185f, 0.521f, -2.302f, 1.429f, -3.064f)
                curveToRelative(0.908f, -0.762f, 2.109f, -1.075f, 3.287f, -0.873f)
                curveToRelative(1.613f, 0.283f, 2.938f, 1.607f, 3.221f, 3.221f)
                curveToRelative(0.298f, 1.698f, -0.509f, 3.396f, -2.009f, 4.222f)
                close()
            }
        }
        .build()
        return _commentQuestion!!
    }

private var _commentQuestion: ImageVector? = null
