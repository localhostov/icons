package me.localx.icons.straight.outline

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

public val Icons.Outline.V: ImageVector
    get() {
        if (_v != null) {
            return _v!!
        }
        _v = Builder(name = "V", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.162f, 0.0f)
                lineTo(11.107f, 21.446f)
                curveToRelative(0.172f, 0.347f, 0.507f, 0.554f, 0.894f, 0.554f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.387f, 0.0f, 0.721f, -0.207f, 0.862f, -0.481f)
                lineTo(21.844f, 0.0f)
                horizontalLineToRelative(2.156f)
                lineTo(14.686f, 22.339f)
                curveToRelative(-0.511f, 1.024f, -1.54f, 1.661f, -2.684f, 1.661f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-1.146f, 0.0f, -2.174f, -0.638f, -2.711f, -1.724f)
                lineTo(-0.005f, 0.0f)
                horizontalLineTo(2.162f)
                close()
            }
        }
        .build()
        return _v!!
    }

private var _v: ImageVector? = null
