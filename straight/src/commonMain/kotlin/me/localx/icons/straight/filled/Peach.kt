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

public val Icons.Filled.Peach: ImageVector
    get() {
        if (_peach != null) {
            return _peach!!
        }
        _peach = Builder(name = "Peach", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.5f)
                curveTo(24.0f, 18.6f, 16.0f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveTo(0.0f, 18.6f, 0.0f, 11.5f)
                arcTo(7.511f, 7.511f, 0.0f, false, true, 6.731f, 4.039f)
                curveTo(10.363f, 4.429f, 12.0f, 7.728f, 12.0f, 11.0f)
                arcToRelative(15.473f, 15.473f, 0.0f, false, true, -1.869f, 6.5f)
                lineToRelative(1.737f, 0.991f)
                arcTo(17.278f, 17.278f, 0.0f, false, false, 14.0f, 11.0f)
                arcToRelative(11.013f, 11.013f, 0.0f, false, false, -0.539f, -3.459f)
                curveToRelative(0.1f, 0.0f, 0.209f, 0.01f, 0.31f, 0.01f)
                arcToRelative(9.934f, 9.934f, 0.0f, false, false, 6.421f, -2.0f)
                curveToRelative(0.137f, -0.11f, 0.244f, -0.229f, 0.367f, -0.342f)
                arcTo(7.445f, 7.445f, 0.0f, false, true, 24.0f, 11.5f)
                close()
                moveTo(18.591f, 0.0f)
                arcToRelative(6.271f, 6.271f, 0.0f, false, false, -5.323f, 2.755f)
                arcTo(4.506f, 4.506f, 0.0f, false, false, 9.0f, 0.0f)
                verticalLineTo(2.0f)
                curveToRelative(1.5f, 0.0f, 2.846f, 1.641f, 3.0f, 3.444f)
                curveToRelative(8.41f, 0.966f, 9.0f, -5.0f, 9.0f, -5.0f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 18.591f, 0.0f)
                close()
            }
        }
        .build()
        return _peach!!
    }

private var _peach: ImageVector? = null
