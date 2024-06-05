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

public val Icons.Bold.Mushroom: ImageVector
    get() {
        if (_mushroom != null) {
            return _mushroom!!
        }
        _mushroom = Builder(name = "Mushroom", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.1f, 0.0f, 11.361f)
                arcTo(4.884f, 4.884f, 0.0f, false, false, 2.784f, 15.71f)
                lineToRelative(0.809f, 0.372f)
                lineToRelative(0.713f, -0.532f)
                arcToRelative(14.788f, 14.788f, 0.0f, false, true, 3.318f, -1.714f)
                arcTo(37.439f, 37.439f, 0.0f, false, false, 7.0f, 19.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 10.0f, 0.0f)
                arcToRelative(37.276f, 37.276f, 0.0f, false, false, -0.623f, -5.157f)
                arcToRelative(15.047f, 15.047f, 0.0f, false, true, 3.317f, 1.707f)
                lineToRelative(0.713f, 0.532f)
                lineToRelative(0.809f, -0.372f)
                arcTo(4.884f, 4.884f, 0.0f, false, false, 24.0f, 11.361f)
                curveTo(24.0f, 5.1f, 18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(14.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                arcToRelative(37.316f, 37.316f, 0.0f, false, true, 0.845f, -5.932f)
                arcTo(10.94f, 10.94f, 0.0f, false, true, 12.0f, 13.0f)
                arcToRelative(10.94f, 10.94f, 0.0f, false, true, 1.155f, 0.068f)
                arcTo(37.3f, 37.3f, 0.0f, false, true, 14.0f, 19.0f)
                close()
                moveTo(20.546f, 12.527f)
                arcTo(17.178f, 17.178f, 0.0f, false, false, 12.0f, 10.0f)
                arcToRelative(17.188f, 17.188f, 0.0f, false, false, -8.545f, 2.526f)
                arcTo(1.712f, 1.712f, 0.0f, false, true, 3.0f, 11.361f)
                curveTo(3.0f, 6.75f, 7.038f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 3.75f, 9.0f, 8.361f)
                arcTo(1.722f, 1.722f, 0.0f, false, true, 20.546f, 12.527f)
                close()
            }
        }
        .build()
        return _mushroom!!
    }

private var _mushroom: ImageVector? = null
