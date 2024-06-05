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

public val Icons.Filled.Question: ImageVector
    get() {
        if (_question != null) {
            return _question!!
        }
        _question = Builder(name = "Question", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -2.318f, 1.382f, -4.357f, 3.891f, -5.741f)
                curveToRelative(2.287f, -1.26f, 3.469f, -3.755f, 3.012f, -6.355f)
                curveToRelative(-0.423f, -2.408f, -2.399f, -4.385f, -4.808f, -4.808f)
                curveToRelative(-1.812f, -0.318f, -3.57f, 0.147f, -4.952f, 1.307f)
                curveToRelative(-1.363f, 1.144f, -2.144f, 2.82f, -2.144f, 4.597f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -2.37f, 1.042f, -4.604f, 2.858f, -6.129f)
                curveTo(8.673f, 0.347f, 11.074f, -0.289f, 13.441f, 0.126f)
                curveToRelative(3.222f, 0.565f, 5.866f, 3.21f, 6.432f, 6.432f)
                curveToRelative(0.598f, 3.402f, -1.017f, 6.798f, -4.016f, 8.453f)
                curveToRelative(-1.303f, 0.718f, -2.857f, 1.993f, -2.857f, 3.989f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(10.5f, 22.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _question!!
    }

private var _question: ImageVector? = null
