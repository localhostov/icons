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

public val Icons.Outline.CocktailAlt: ImageVector
    get() {
        if (_cocktailAlt != null) {
            return _cocktailAlt!!
        }
        _cocktailAlt = Builder(name = "CocktailAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.869f, 12.888f)
                lineTo(23.04f, 5.337f)
                curveToRelative(2.075f, -1.782f, 0.479f, -5.448f, -2.2f, -5.337f)
                horizontalLineTo(3.158f)
                curveTo(0.467f, -0.1f, -1.128f, 3.559f, 0.991f, 5.365f)
                lineToRelative(8.146f, 7.529f)
                arcTo(4.243f, 4.243f, 0.0f, false, false, 11.0f, 13.87f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineTo(17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.869f)
                arcTo(4.258f, 4.258f, 0.0f, false, false, 14.869f, 12.888f)
                close()
                moveTo(4.624f, 6.0f)
                horizontalLineTo(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(2.46f)
                arcToRelative(1.109f, 1.109f, 0.0f, false, true, 0.7f, -2.0f)
                horizontalLineTo(20.842f)
                arcToRelative(1.148f, 1.148f, 0.0f, false, true, 1.076f, 0.753f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.652f, 3.9f)
                lineToRelative(-8.135f, 7.517f)
                arcToRelative(2.254f, 2.254f, 0.0f, false, true, -1.5f, 0.589f)
                arcToRelative(0.049f, 0.049f, 0.0f, false, false, -0.024f, 0.0f)
                arcToRelative(2.235f, 2.235f, 0.0f, false, true, -1.5f, -0.583f)
                close()
            }
        }
        .build()
        return _cocktailAlt!!
    }

private var _cocktailAlt: ImageVector? = null
