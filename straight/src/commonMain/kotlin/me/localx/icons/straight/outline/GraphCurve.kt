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

public val Icons.Outline.GraphCurve: ImageVector
    get() {
        if (_graphCurve != null) {
            return _graphCurve!!
        }
        _graphCurve = Builder(name = "GraphCurve", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.058f, 22.0f)
                horizontalLineToRelative(20.942f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(17.495f)
                curveToRelative(2.582f, -7.085f, 9.886f, -12.495f, 18.0f, -12.495f)
                horizontalLineToRelative(1.001f)
                lineToRelative(-2.218f, -2.277f)
                lineToRelative(1.433f, -1.395f)
                lineToRelative(3.207f, 3.293f)
                curveToRelative(0.771f, 0.77f, 0.771f, 2.039f, -0.009f, 2.818f)
                lineToRelative(-3.25f, 3.25f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.275f, -2.275f)
                horizontalLineToRelative(-1.025f)
                curveTo(11.301f, 7.0f, 3.65f, 13.902f, 3.058f, 22.0f)
                close()
            }
        }
        .build()
        return _graphCurve!!
    }

private var _graphCurve: ImageVector? = null
