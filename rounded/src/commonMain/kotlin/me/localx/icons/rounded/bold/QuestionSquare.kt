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

public val Icons.Bold.QuestionSquare: ImageVector
    get() {
        if (_questionSquare != null) {
            return _questionSquare!!
        }
        _questionSquare = Builder(name = "QuestionSquare", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.938f, 8.288f)
                curveToRelative(0.298f, 1.696f, -0.509f, 3.391f, -2.008f, 4.217f)
                curveToRelative(0.0f, 0.0f, -0.415f, 0.218f, -0.466f, 0.245f)
                curveToRelative(-0.157f, 0.677f, -0.757f, 1.251f, -1.463f, 1.251f)
                curveToRelative(-0.811f, -0.023f, -1.5f, -0.688f, -1.5f, -1.5f)
                curveToRelative(0.0f, -1.585f, 1.13f, -2.176f, 1.737f, -2.493f)
                lineToRelative(0.243f, -0.129f)
                curveToRelative(0.291f, -0.16f, 0.596f, -0.537f, 0.502f, -1.071f)
                curveToRelative(-0.067f, -0.383f, -0.406f, -0.722f, -0.789f, -0.789f)
                curveToRelative(-0.613f, -0.11f, -1.129f, 0.316f, -1.224f, 0.781f)
                curveToRelative(-0.165f, 0.811f, -0.957f, 1.33f, -1.769f, 1.171f)
                curveToRelative(-0.812f, -0.165f, -1.336f, -0.957f, -1.171f, -1.769f)
                curveToRelative(0.429f, -2.11f, 2.531f, -3.518f, 4.683f, -3.139f)
                curveToRelative(1.615f, 0.283f, 2.941f, 1.61f, 3.225f, 3.225f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.032f, -2.467f, 5.5f, -5.5f, 5.5f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.468f, -5.5f, -5.5f)
                lineTo(0.0f, 5.5f)
                curveTo(0.0f, 2.467f, 2.467f, 0.0f, 5.5f, 0.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                close()
                moveTo(21.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                lineTo(5.5f, 3.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                lineTo(21.0f, 5.5f)
                close()
            }
        }
        .build()
        return _questionSquare!!
    }

private var _questionSquare: ImageVector? = null
