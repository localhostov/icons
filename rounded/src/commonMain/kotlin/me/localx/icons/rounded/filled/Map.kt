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

public val Icons.Filled.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 23.894f)
                arcToRelative(4.57f, 4.57f, 0.0f, false, true, -0.527f, -0.122f)
                lineToRelative(-2.869f, -0.9f)
                arcToRelative(5.013f, 5.013f, 0.0f, false, true, -3.6f, -4.8f)
                verticalLineTo(6.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 6.92f, 1.388f)
                lineTo(7.0f, 1.425f)
                close()
                moveTo(20.68f, 1.167f)
                lineToRelative(-0.021f, -0.007f)
                lineToRelative(-2.715f, -0.9f)
                arcTo(4.951f, 4.951f, 0.0f, false, false, 17.0f, 0.053f)
                verticalLineTo(22.315f)
                lineToRelative(2.054f, 0.592f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 24.0f, 19.021f)
                verticalLineTo(5.876f)
                arcTo(5.01f, 5.01f, 0.0f, false, false, 20.68f, 1.167f)
                close()
                moveTo(15.0f, 0.19f)
                reflectiveCurveTo(9.157f, 1.863f, 9.0f, 1.88f)
                verticalLineToRelative(22.0f)
                curveToRelative(0.1f, -0.021f, 6.0f, -1.636f, 6.0f, -1.636f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
