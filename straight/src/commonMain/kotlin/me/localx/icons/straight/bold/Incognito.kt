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

public val Icons.Bold.Incognito: ImageVector
    get() {
        if (_incognito != null) {
            return _incognito!!
        }
        _incognito = Builder(name = "Incognito", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.954f, 9.082f)
                curveTo(19.5f, 1.45f, 15.529f, 0.0f, 14.984f, 0.0f)
                arcTo(5.328f, 5.328f, 0.0f, false, false, 12.0f, 1.0f)
                arcTo(5.186f, 5.186f, 0.0f, false, false, 9.067f, 0.0f)
                curveTo(8.471f, 0.0f, 4.5f, 1.45f, 4.046f, 9.082f)
                curveTo(1.57f, 9.7f, 0.0f, 10.605f, 0.0f, 11.613f)
                curveTo(0.0f, 13.484f, 5.373f, 15.0f, 12.0f, 15.0f)
                reflectiveCurveToRelative(12.0f, -1.516f, 12.0f, -3.387f)
                curveTo(24.0f, 10.605f, 22.43f, 9.7f, 19.954f, 9.082f)
                close()
                moveTo(12.0f, 10.0f)
                arcToRelative(21.435f, 21.435f, 0.0f, false, true, -4.975f, -0.486f)
                curveToRelative(0.224f, -4.728f, 1.893f, -6.143f, 2.42f, -6.477f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 1.222f, 0.95f)
                lineTo(12.0f, 6.571f)
                lineToRelative(1.333f, -2.584f)
                arcToRelative(1.807f, 1.807f, 0.0f, false, true, 1.207f, -0.949f)
                curveToRelative(0.575f, 0.363f, 2.213f, 1.8f, 2.435f, 6.475f)
                arcTo(21.425f, 21.425f, 0.0f, false, true, 12.0f, 10.0f)
                close()
                moveTo(21.0f, 20.0f)
                arcToRelative(3.989f, 3.989f, 0.0f, false, true, -7.8f, 1.193f)
                arcTo(5.751f, 5.751f, 0.0f, false, false, 12.0f, 21.0f)
                arcToRelative(5.751f, 5.751f, 0.0f, false, false, -1.2f, 0.193f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -0.259f, -3.018f)
                arcTo(7.526f, 7.526f, 0.0f, false, true, 12.0f, 18.0f)
                arcToRelative(7.526f, 7.526f, 0.0f, false, true, 1.461f, 0.175f)
                arcTo(3.987f, 3.987f, 0.0f, false, true, 21.0f, 20.0f)
                close()
            }
        }
        .build()
        return _incognito!!
    }

private var _incognito: ImageVector? = null
