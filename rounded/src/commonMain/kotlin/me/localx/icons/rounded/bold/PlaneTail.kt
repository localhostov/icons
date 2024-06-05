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

public val Icons.Bold.PlaneTail: ImageVector
    get() {
        if (_planeTail != null) {
            return _planeTail!!
        }
        _planeTail = Builder(name = "PlaneTail", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.271f, 15.114f)
                curveToRelative(-0.89f, -0.321f, -1.954f, -0.688f, -3.145f, -1.066f)
                lineToRelative(2.775f, -10.409f)
                curveToRelative(0.233f, -0.875f, 0.052f, -1.789f, -0.5f, -2.508f)
                curveToRelative(-0.553f, -0.719f, -1.389f, -1.131f, -2.295f, -1.131f)
                horizontalLineToRelative(-0.276f)
                curveToRelative(-1.469f, 0.0f, -2.871f, 0.692f, -3.765f, 1.854f)
                curveToRelative(0.0f, 0.0f, -6.722f, 7.761f, -6.742f, 7.789f)
                curveToRelative(-0.971f, 1.292f, -2.938f, 1.357f, -3.323f, 1.357f)
                lineTo(1.5f, 11.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(6.264f, 0.0f, 13.394f, 2.077f, 17.674f, 3.556f)
                curveToRelative(-4.281f, 1.433f, -11.41f, 3.444f, -17.674f, 3.444f)
                lineTo(1.5f, 21.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(7.271f, 0.0f, 15.493f, -2.496f, 19.749f, -3.983f)
                curveToRelative(1.054f, -0.369f, 1.738f, -1.328f, 1.743f, -2.443f)
                reflectiveCurveToRelative(-0.67f, -2.08f, -1.721f, -2.459f)
                close()
                moveTo(10.687f, 11.488f)
                reflectiveCurveToRelative(6.722f, -7.761f, 6.743f, -7.789f)
                curveToRelative(0.328f, -0.438f, 0.852f, -0.699f, 1.399f, -0.699f)
                horizontalLineToRelative(0.137f)
                lineToRelative(-2.717f, 10.189f)
                curveToRelative(-1.812f, -0.505f, -3.792f, -0.989f, -5.835f, -1.372f)
                curveToRelative(0.093f, -0.105f, 0.184f, -0.214f, 0.272f, -0.329f)
                close()
                moveTo(6.5f, 19.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                lineTo(6.5f, 19.0f)
                close()
            }
        }
        .build()
        return _planeTail!!
    }

private var _planeTail: ImageVector? = null
