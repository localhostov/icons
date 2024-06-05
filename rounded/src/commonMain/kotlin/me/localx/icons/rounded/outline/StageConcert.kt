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

public val Icons.Outline.StageConcert: ImageVector
    get() {
        if (_stageConcert != null) {
            return _stageConcert!!
        }
        _stageConcert = Builder(name = "StageConcert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.193f, 3.832f)
                lineTo(14.193f, 0.488f)
                curveToRelative(-1.37f, -0.654f, -2.94f, -0.654f, -4.31f, 0.0f)
                lineTo(2.883f, 3.832f)
                curveTo(1.155f, 4.657f, 0.039f, 6.429f, 0.039f, 8.341f)
                lineToRelative(-0.039f, 14.656f)
                curveToRelative(-0.001f, 0.553f, 0.445f, 1.002f, 0.998f, 1.003f)
                horizontalLineToRelative(0.002f)
                curveToRelative(0.551f, 0.0f, 0.999f, -0.446f, 1.0f, -0.997f)
                lineToRelative(0.008f, -3.003f)
                horizontalLineToRelative(19.992f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-14.656f)
                curveToRelative(0.0f, -1.956f, -1.076f, -3.686f, -2.807f, -4.512f)
                close()
                moveTo(10.745f, 2.293f)
                curveToRelative(0.822f, -0.392f, 1.765f, -0.393f, 2.586f, 0.0f)
                lineToRelative(5.667f, 2.707f)
                lineTo(5.078f, 5.0f)
                lineToRelative(5.667f, -2.707f)
                close()
                moveTo(13.0f, 18.0f)
                verticalLineToRelative(-5.0f)
                lineToRelative(1.6f, -1.2f)
                curveToRelative(0.442f, -0.331f, 0.531f, -0.958f, 0.2f, -1.399f)
                curveToRelative(-0.33f, -0.442f, -0.957f, -0.531f, -1.4f, -0.2f)
                lineToRelative(-1.6f, 1.2f)
                curveToRelative(-0.501f, 0.375f, -0.8f, 0.974f, -0.8f, 1.6f)
                verticalLineToRelative(5.0f)
                lineTo(2.013f, 18.001f)
                lineToRelative(0.025f, -9.656f)
                curveToRelative(0.0f, -0.475f, 0.12f, -0.932f, 0.327f, -1.344f)
                horizontalLineToRelative(2.634f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.692f)
                curveToRelative(0.197f, 0.407f, 0.308f, 0.862f, 0.308f, 1.344f)
                verticalLineToRelative(9.656f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(18.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(7.0f, 24.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _stageConcert!!
    }

private var _stageConcert: ImageVector? = null
