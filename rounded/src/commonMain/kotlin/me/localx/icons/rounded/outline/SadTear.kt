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

public val Icons.Outline.SadTear: ImageVector
    get() {
        if (_sadTear != null) {
            return _sadTear!!
        }
        _sadTear = Builder(name = "SadTear", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 9.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.0f, 9.5f)
                close()
                moveTo(15.5f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.5f, 8.0f)
                close()
                moveTo(24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                curveTo(-3.9f, 0.6f, -3.893f, 23.4f, 12.0f, 24.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 24.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 12.0f, 22.0f)
                curveTo(-1.249f, 21.5f, -1.244f, 2.5f, 12.0f, 2.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 22.0f, 12.0f)
                close()
                moveTo(17.746f, 17.666f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.08f, -1.412f)
                arcTo(9.454f, 9.454f, 0.0f, false, false, 12.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcToRelative(7.519f, 7.519f, 0.0f, false, true, 4.336f, 1.747f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.41f, -0.081f)
                close()
                moveTo(5.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                arcToRelative(6.571f, 6.571f, 0.0f, false, false, -1.538f, -3.388f)
                curveTo(6.46f, 11.512f, 4.953f, 15.152f, 5.0f, 16.0f)
                close()
            }
        }
        .build()
        return _sadTear!!
    }

private var _sadTear: ImageVector? = null
