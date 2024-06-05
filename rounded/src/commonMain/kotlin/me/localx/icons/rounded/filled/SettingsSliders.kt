package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.SettingsSliders: ImageVector
    get() {
        if (_settingsSliders != null) {
            return _settingsSliders!!
        }
        _settingsSliders = Builder(name = "SettingsSliders", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.051f, viewportHeight = 512.051f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.359f, 101.359f)
                horizontalLineToRelative(58.368f)
                curveToRelative(11.52f, 42.386f, 55.219f, 67.408f, 97.605f, 55.888f)
                curveToRelative(27.223f, -7.399f, 48.489f, -28.665f, 55.888f, -55.888f)
                horizontalLineToRelative(257.472f)
                curveToRelative(11.782f, 0.0f, 21.333f, -9.551f, 21.333f, -21.333f)
                reflectiveCurveToRelative(-9.551f, -21.333f, -21.333f, -21.333f)
                horizontalLineTo(233.22f)
                curveTo(221.7f, 16.306f, 178.001f, -8.716f, 135.615f, 2.804f)
                curveToRelative(-27.223f, 7.399f, -48.489f, 28.665f, -55.888f, 55.888f)
                horizontalLineTo(21.359f)
                curveToRelative(-11.782f, 0.0f, -21.333f, 9.551f, -21.333f, 21.333f)
                reflectiveCurveTo(9.577f, 101.359f, 21.359f, 101.359f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(490.692f, 234.692f)
                horizontalLineToRelative(-58.368f)
                curveToRelative(-11.497f, -42.38f, -55.172f, -67.416f, -97.552f, -55.92f)
                curveToRelative(-27.245f, 7.391f, -48.529f, 28.674f, -55.92f, 55.92f)
                horizontalLineTo(21.359f)
                curveToRelative(-11.782f, 0.0f, -21.333f, 9.551f, -21.333f, 21.333f)
                curveToRelative(0.0f, 11.782f, 9.551f, 21.333f, 21.333f, 21.333f)
                horizontalLineToRelative(257.493f)
                curveToRelative(11.497f, 42.38f, 55.172f, 67.416f, 97.552f, 55.92f)
                curveToRelative(27.245f, -7.391f, 48.529f, -28.674f, 55.92f, -55.92f)
                horizontalLineToRelative(58.368f)
                curveToRelative(11.782f, 0.0f, 21.333f, -9.551f, 21.333f, -21.333f)
                curveTo(512.025f, 244.243f, 502.474f, 234.692f, 490.692f, 234.692f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(490.692f, 410.692f)
                horizontalLineTo(233.22f)
                curveToRelative(-11.52f, -42.386f, -55.219f, -67.408f, -97.605f, -55.888f)
                curveToRelative(-27.223f, 7.399f, -48.489f, 28.665f, -55.888f, 55.888f)
                horizontalLineTo(21.359f)
                curveToRelative(-11.782f, 0.0f, -21.333f, 9.551f, -21.333f, 21.333f)
                curveToRelative(0.0f, 11.782f, 9.551f, 21.333f, 21.333f, 21.333f)
                horizontalLineToRelative(58.368f)
                curveToRelative(11.52f, 42.386f, 55.219f, 67.408f, 97.605f, 55.888f)
                curveToRelative(27.223f, -7.399f, 48.489f, -28.665f, 55.888f, -55.888f)
                horizontalLineToRelative(257.472f)
                curveToRelative(11.782f, 0.0f, 21.333f, -9.551f, 21.333f, -21.333f)
                curveTo(512.025f, 420.243f, 502.474f, 410.692f, 490.692f, 410.692f)
                close()
            }
        }
        .build()
        return _settingsSliders!!
    }

private var _settingsSliders: ImageVector? = null
