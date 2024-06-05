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

public val Icons.Bold.SadTear: ImageVector
    get() {
        if (_sadTear != null) {
            return _sadTear!!
        }
        _sadTear = Builder(name = "SadTear", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.2f, 9.4f, -11.0f, 15.336f, -18.643f, 9.986f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, 3.528f, -1.553f)
                arcTo(9.035f, 9.035f, 0.0f, false, false, 21.0f, 12.0f)
                curveTo(20.432f, -0.437f, 2.512f, 0.351f, 3.039f, 12.778f)
                arcToRelative(9.171f, 9.171f, 0.0f, false, false, -1.991f, 4.1f)
                curveTo(-2.576f, 9.245f, 3.5f, -0.2f, 12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(8.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 7.0f)
                close()
                moveTo(18.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 9.0f)
                close()
                moveTo(8.0f, 17.5f)
                curveTo(8.0f, 15.462f, 5.5f, 13.0f, 5.5f, 13.0f)
                curveTo(-1.059f, 19.559f, 7.486f, 22.474f, 8.0f, 17.5f)
                close()
                moveTo(8.666f, 13.734f)
                arcToRelative(8.355f, 8.355f, 0.0f, false, true, 1.221f, 2.741f)
                curveToRelative(2.339f, -1.279f, 5.4f, 0.409f, 6.122f, 1.15f)
                lineTo(18.0f, 15.382f)
                curveTo(16.763f, 14.128f, 12.34f, 11.84f, 8.666f, 13.734f)
                close()
            }
        }
        .build()
        return _sadTear!!
    }

private var _sadTear: ImageVector? = null
