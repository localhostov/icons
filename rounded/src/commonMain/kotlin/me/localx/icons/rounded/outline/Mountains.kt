package me.localx.icons.rounded.outline

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

public val Icons.Outline.Mountains: ImageVector
    get() {
        if (_mountains != null) {
            return _mountains!!
        }
        _mountains = Builder(name = "Mountains", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 20.0f, 8.0f)
                close()
                moveTo(20.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 2.0f)
                close()
                moveTo(21.452f, 24.0f)
                lineTo(12.589f, 24.0f)
                arcToRelative(2.548f, 2.548f, 0.0f, false, true, -2.221f, -1.26f)
                arcToRelative(2.463f, 2.463f, 0.0f, false, true, -0.029f, -2.471f)
                lineToRelative(4.436f, -7.959f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, 4.5f, 0.0f)
                lineTo(23.7f, 20.263f)
                arcToRelative(2.468f, 2.468f, 0.0f, false, true, -0.028f, 2.475f)
                arcTo(2.551f, 2.551f, 0.0f, false, true, 21.452f, 24.0f)
                close()
                moveTo(17.023f, 13.0f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, false, -0.5f, 0.283f)
                lineToRelative(-4.436f, 7.959f)
                arcToRelative(0.473f, 0.473f, 0.0f, false, false, 0.006f, 0.485f)
                arcToRelative(0.559f, 0.559f, 0.0f, false, false, 0.5f, 0.273f)
                horizontalLineToRelative(8.863f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, false, 0.5f, -0.275f)
                arcToRelative(0.479f, 0.479f, 0.0f, false, false, 0.0f, -0.489f)
                lineToRelative(-4.432f, -7.952f)
                horizontalLineToRelative(0.0f)
                arcTo(0.558f, 0.558f, 0.0f, false, false, 17.023f, 13.0f)
                close()
                moveTo(8.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(3.35f, 22.0f)
                arcToRelative(1.349f, 1.349f, 0.0f, false, true, -1.184f, -1.994f)
                lineToRelative(6.652f, -12.3f)
                arcTo(1.329f, 1.329f, 0.0f, false, true, 10.0f, 7.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.326f, 1.326f, 0.0f, false, true, 1.183f, 0.706f)
                lineTo(12.41f, 9.973f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.76f, -0.952f)
                lineTo(12.944f, 6.755f)
                arcToRelative(3.344f, 3.344f, 0.0f, false, false, -5.885f, 0.0f)
                lineTo(0.406f, 19.055f)
                arcTo(3.351f, 3.351f, 0.0f, false, false, 3.35f, 24.0f)
                lineTo(7.0f, 24.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 23.0f)
                close()
            }
        }
        .build()
        return _mountains!!
    }

private var _mountains: ImageVector? = null
