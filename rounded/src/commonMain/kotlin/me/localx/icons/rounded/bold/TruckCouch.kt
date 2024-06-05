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

public val Icons.Bold.TruckCouch: ImageVector
    get() {
        if (_truckCouch != null) {
            return _truckCouch!!
        }
        _truckCouch = Builder(name = "TruckCouch", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 17.0f)
                arcToRelative(3.432f, 3.432f, 0.0f, false, false, -0.5f, 0.036f)
                verticalLineTo(5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 22.5f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 17.0f, 5.5f)
                verticalLineTo(16.377f)
                lineTo(4.0f, 20.2f)
                lineToRelative(-0.728f, -2.616f)
                lineToRelative(9.951f, -2.945f)
                arcToRelative(2.494f, 2.494f, 0.0f, false, false, 1.723f, -3.046f)
                lineToRelative(-1.1f, -4.328f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -5.572f, -3.09f)
                lineTo(4.256f, 5.332f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -3.093f, 5.521f)
                lineTo(1.69f, 12.9f)
                arcTo(4.481f, 4.481f, 0.0f, false, false, 0.169f, 17.627f)
                lineToRelative(0.952f, 3.421f)
                lineToRelative(-0.044f, 0.013f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.846f, 2.878f)
                lineToRelative(15.235f, -4.481f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 20.5f, 17.0f)
                close()
                moveTo(5.086f, 8.215f)
                lineTo(9.1f, 7.059f)
                arcToRelative(1.489f, 1.489f, 0.0f, false, true, 1.142f, 0.129f)
                arcToRelative(1.47f, 1.47f, 0.0f, false, true, 0.7f, 0.858f)
                lineToRelative(0.979f, 3.849f)
                lineTo(5.051f, 13.93f)
                lineToRelative(-0.992f, -3.862f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.086f, 8.215f)
                close()
            }
        }
        .build()
        return _truckCouch!!
    }

private var _truckCouch: ImageVector? = null
