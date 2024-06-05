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

public val Icons.Outline.PlaneAlt: ImageVector
    get() {
        if (_planeAlt != null) {
            return _planeAlt!!
        }
        _planeAlt = Builder(name = "PlaneAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.96f, 11.5f)
                arcTo(3.084f, 3.084f, 0.0f, false, false, 20.893f, 9.0f)
                horizontalLineToRelative(-3.3f)
                lineTo(13.446f, 1.563f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 10.812f, 0.0f)
                lineTo(7.069f, 0.0f)
                lineToRelative(3.038f, 9.0f)
                lineTo(6.985f, 9.0f)
                lineToRelative(-1.1f, -1.657f)
                arcTo(2.994f, 2.994f, 0.0f, false, false, 3.388f, 6.0f)
                lineTo(0.027f, 6.0f)
                lineTo(2.24f, 12.0f)
                lineToRelative(-2.2f, 6.0f)
                lineTo(3.4f, 18.0f)
                arcToRelative(2.991f, 2.991f, 0.0f, false, false, 2.5f, -1.347f)
                lineTo(6.988f, 15.0f)
                horizontalLineToRelative(3.119f)
                lineTo(7.069f, 24.0f)
                horizontalLineToRelative(3.743f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.63f, -1.556f)
                lineTo(17.588f, 15.0f)
                lineTo(21.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.96f, -3.5f)
                close()
                moveTo(21.76f, 12.644f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 13.0f)
                lineTo(16.412f, 13.0f)
                lineTo(11.69f, 21.479f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.878f, 0.521f)
                lineTo(9.854f, 22.0f)
                lineToRelative(3.039f, -9.0f)
                lineTo(5.908f, 13.0f)
                lineTo(4.233f, 15.552f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.4f, 16.0f)
                lineTo(2.906f, 16.0f)
                lineToRelative(1.465f, -4.0f)
                lineTo(2.9f, 8.0f)
                horizontalLineToRelative(0.492f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.833f, 0.448f)
                lineTo(5.911f, 11.0f)
                horizontalLineToRelative(6.982f)
                lineTo(9.854f, 2.0f)
                horizontalLineToRelative(0.958f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.882f, 0.529f)
                lineTo(16.412f, 11.0f)
                horizontalLineToRelative(4.481f)
                arcToRelative(1.083f, 1.083f, 0.0f, false, true, 1.092f, 0.825f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.763f, 12.647f)
                close()
            }
        }
        .build()
        return _planeAlt!!
    }

private var _planeAlt: ImageVector? = null
