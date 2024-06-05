package me.localx.icons.straight.bold

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

public val Icons.Bold.GraphCurve: ImageVector
    get() {
        if (_graphCurve != null) {
            return _graphCurve!!
        }
        _graphCurve = Builder(name = "GraphCurve", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.175f, 21.0f)
                horizontalLineToRelative(19.825f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(15.144f)
                curveToRelative(3.143f, -5.943f, 9.656f, -10.144f, 17.0f, -10.144f)
                verticalLineToRelative(-3.0f)
                lineToRelative(3.696f, 3.793f)
                curveToRelative(0.405f, 0.391f, 0.405f, 1.024f, 0.0f, 1.414f)
                lineToRelative(-3.696f, 3.793f)
                verticalLineToRelative(-3.0f)
                curveToRelative(-7.802f, 0.0f, -14.708f, 5.878f, -15.825f, 13.0f)
                close()
            }
        }
        .build()
        return _graphCurve!!
    }

private var _graphCurve: ImageVector? = null
