package me.localx.icons.rounded.bold

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

public val Icons.Bold.CommentSmile: ImageVector
    get() {
        if (_commentSmile != null) {
            return _commentSmile!!
        }
        _commentSmile = Builder(name = "CommentSmile", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.071f, 12.962f)
                curveToRelative(0.571f, 0.59f, 0.568f, 1.525f, -0.016f, 2.104f)
                curveToRelative(-0.2f, 0.198f, -2.04f, 1.934f, -5.056f, 1.934f)
                reflectiveCurveToRelative(-4.855f, -1.736f, -5.056f, -1.934f)
                curveToRelative(-0.589f, -0.583f, -0.593f, -1.533f, -0.01f, -2.122f)
                curveToRelative(0.581f, -0.588f, 1.53f, -0.593f, 2.121f, -0.01f)
                curveToRelative(0.035f, 0.033f, 1.146f, 1.066f, 2.944f, 1.066f)
                reflectiveCurveToRelative(2.909f, -1.033f, 2.956f, -1.077f)
                curveToRelative(0.595f, -0.565f, 1.542f, -0.551f, 2.115f, 0.04f)
                close()
                moveTo(8.5f, 11.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(15.5f, 11.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 12.325f)
                verticalLineToRelative(6.357f)
                curveToRelative(0.0f, 2.933f, -2.386f, 5.318f, -5.318f, 5.318f)
                horizontalLineToRelative(-5.647f)
                curveTo(6.061f, 24.0f, 0.471f, 19.208f, 0.03f, 12.853f)
                curveToRelative(-0.241f, -3.475f, 1.026f, -6.876f, 3.479f, -9.332f)
                curveTo(5.96f, 1.066f, 9.354f, -0.206f, 12.835f, 0.028f)
                curveToRelative(6.261f, 0.426f, 11.165f, 5.827f, 11.165f, 12.296f)
                close()
                moveTo(21.0f, 12.325f)
                curveToRelative(0.0f, -4.898f, -3.676f, -8.984f, -8.368f, -9.303f)
                curveToRelative(-0.206f, -0.014f, -0.412f, -0.021f, -0.617f, -0.021f)
                curveToRelative(-2.392f, 0.0f, -4.689f, 0.944f, -6.383f, 2.64f)
                curveToRelative(-1.84f, 1.842f, -2.79f, 4.395f, -2.609f, 7.004f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.336f, 4.841f, 4.546f, 8.355f, 10.012f, 8.355f)
                horizontalLineToRelative(5.647f)
                curveToRelative(1.278f, 0.0f, 2.318f, -1.04f, 2.318f, -2.318f)
                verticalLineToRelative(-6.357f)
                close()
            }
        }
        .build()
        return _commentSmile!!
    }

private var _commentSmile: ImageVector? = null
