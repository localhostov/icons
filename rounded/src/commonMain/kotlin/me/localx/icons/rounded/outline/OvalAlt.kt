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

public val Icons.Outline.OvalAlt: ImageVector
    get() {
        if (_ovalAlt != null) {
            return _ovalAlt!!
        }
        _ovalAlt = Builder(name = "OvalAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 24.0f)
                curveToRelative(-4.486f, 0.0f, -8.0f, -5.271f, -8.0f, -12.0f)
                reflectiveCurveTo(7.514f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(8.0f, 5.271f, 8.0f, 12.0f)
                reflectiveCurveToRelative(-3.514f, 12.0f, -8.0f, 12.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(-3.252f, 0.0f, -6.0f, 4.58f, -6.0f, 10.0f)
                reflectiveCurveToRelative(2.748f, 10.0f, 6.0f, 10.0f)
                reflectiveCurveToRelative(6.0f, -4.58f, 6.0f, -10.0f)
                reflectiveCurveTo(15.252f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _ovalAlt!!
    }

private var _ovalAlt: ImageVector? = null
