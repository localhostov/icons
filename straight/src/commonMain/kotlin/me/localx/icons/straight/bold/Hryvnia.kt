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

public val Icons.Bold.Hryvnia: ImageVector
    get() {
        if (_hryvnia != null) {
            return _hryvnia!!
        }
        _hryvnia = Builder(name = "Hryvnia", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.483f, 11.0f)
                horizontalLineToRelative(3.517f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.248f)
                curveToRelative(0.162f, -0.519f, 0.248f, -1.065f, 0.248f, -1.624f)
                curveToRelative(0.0f, -2.029f, -1.114f, -3.892f, -2.907f, -4.858f)
                curveToRelative(-1.868f, -1.007f, -3.911f, -1.518f, -6.07f, -1.518f)
                curveTo(6.69f, 0.0f, 3.461f, 3.168f, 3.326f, 3.303f)
                lineToRelative(2.115f, 2.127f)
                curveToRelative(0.024f, -0.024f, 2.533f, -2.43f, 6.581f, -2.43f)
                curveToRelative(1.657f, 0.0f, 3.221f, 0.39f, 4.646f, 1.158f)
                curveToRelative(0.821f, 0.442f, 1.331f, 1.293f, 1.331f, 2.218f)
                curveToRelative(0.0f, 0.605f, -0.222f, 1.178f, -0.6f, 1.624f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(10.414f)
                lineToRelative(-3.778f, 1.442f)
                curveToRelative(-0.385f, 0.147f, -0.748f, 0.335f, -1.085f, 0.558f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.273f)
                curveToRelative(-0.178f, 0.549f, -0.273f, 1.13f, -0.273f, 1.724f)
                curveToRelative(0.0f, 2.144f, 1.224f, 4.128f, 3.119f, 5.058f)
                curveToRelative(1.652f, 0.809f, 3.639f, 1.219f, 5.903f, 1.219f)
                curveToRelative(5.214f, 0.0f, 9.318f, -3.034f, 9.491f, -3.163f)
                lineToRelative(-1.798f, -2.402f)
                curveToRelative(-0.034f, 0.025f, -3.504f, 2.565f, -7.693f, 2.565f)
                curveToRelative(-1.804f, 0.0f, -3.347f, -0.308f, -4.584f, -0.913f)
                curveToRelative(-0.874f, -0.429f, -1.438f, -1.356f, -1.438f, -2.363f)
                curveToRelative(0.0f, -0.643f, 0.237f, -1.252f, 0.64f, -1.724f)
                horizontalLineToRelative(15.36f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(13.587f)
                lineToRelative(3.87f, -1.478f)
                curveToRelative(0.364f, -0.139f, 0.707f, -0.315f, 1.026f, -0.522f)
                close()
            }
        }
        .build()
        return _hryvnia!!
    }

private var _hryvnia: ImageVector? = null
