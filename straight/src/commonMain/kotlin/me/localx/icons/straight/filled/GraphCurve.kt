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

public val Icons.Filled.GraphCurve: ImageVector
    get() {
        if (_graphCurve != null) {
            return _graphCurve!!
        }
        _graphCurve = Builder(name = "GraphCurve", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 7.0f)
                horizontalLineToRelative(1.025f)
                lineToRelative(-2.275f, 2.275f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(3.25f, -3.25f)
                curveToRelative(0.78f, -0.779f, 0.78f, -2.049f, 0.009f, -2.818f)
                lineToRelative(-3.207f, -3.293f)
                lineToRelative(-1.433f, 1.395f)
                lineToRelative(2.218f, 2.277f)
                horizontalLineToRelative(-1.001f)
                curveToRelative(-8.114f, 0.0f, -15.418f, 5.411f, -18.0f, 12.495f)
                verticalLineTo(0.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(3.058f)
                curveToRelative(0.592f, -8.098f, 8.243f, -15.0f, 16.942f, -15.0f)
                close()
            }
        }
        .build()
        return _graphCurve!!
    }

private var _graphCurve: ImageVector? = null
