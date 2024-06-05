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

public val Icons.Filled.Oval: ImageVector
    get() {
        if (_oval != null) {
            return _oval!!
        }
        _oval = Builder(name = "Oval", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 20.0f)
                curveToRelative(-6.729f, 0.0f, -12.0f, -3.514f, -12.0f, -8.0f)
                reflectiveCurveTo(5.271f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(12.0f, 3.514f, 12.0f, 8.0f)
                reflectiveCurveToRelative(-5.271f, 8.0f, -12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _oval!!
    }

private var _oval: ImageVector? = null
