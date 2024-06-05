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

public val Icons.Outline.UserTrust: ImageVector
    get() {
        if (_userTrust != null) {
            return _userTrust!!
        }
        _userTrust = Builder(name = "UserTrust", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 24.0f)
                curveToRelative(-3.584f, 0.0f, -6.5f, -2.916f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.916f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.916f, 6.5f, 6.5f)
                reflectiveCurveToRelative(-2.916f, 6.5f, -6.5f, 6.5f)
                close()
                moveTo(17.5f, 13.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.019f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.019f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.019f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(18.499f, 19.354f)
                lineToRelative(1.886f, -1.833f)
                curveToRelative(0.396f, -0.385f, 0.405f, -1.018f, 0.021f, -1.414f)
                curveToRelative(-0.385f, -0.395f, -1.018f, -0.406f, -1.414f, -0.02f)
                lineToRelative(-1.892f, 1.838f)
                curveToRelative(-0.099f, 0.1f, -0.262f, 0.1f, -0.362f, 0.0f)
                lineToRelative(-0.876f, -0.858f)
                curveToRelative(-0.395f, -0.386f, -1.027f, -0.379f, -1.414f, 0.016f)
                reflectiveCurveToRelative(-0.38f, 1.027f, 0.015f, 1.414f)
                lineToRelative(0.876f, 0.858f)
                curveToRelative(0.437f, 0.428f, 1.01f, 0.641f, 1.582f, 0.641f)
                reflectiveCurveToRelative(1.146f, -0.215f, 1.579f, -0.643f)
                close()
                moveTo(9.0f, 12.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveTo(5.691f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(9.0f, 2.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(2.0f, 23.0f)
                curveToRelative(0.0f, -3.524f, 2.633f, -6.511f, 6.124f, -6.946f)
                curveToRelative(0.548f, -0.068f, 0.937f, -0.568f, 0.869f, -1.116f)
                reflectiveCurveToRelative(-0.574f, -0.931f, -1.116f, -0.868f)
                curveTo(3.386f, 14.629f, 0.0f, 18.469f, 0.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _userTrust!!
    }

private var _userTrust: ImageVector? = null
