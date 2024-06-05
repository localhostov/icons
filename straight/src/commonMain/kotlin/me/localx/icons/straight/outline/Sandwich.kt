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

public val Icons.Outline.Sandwich: ImageVector
    get() {
        if (_sandwich != null) {
            return _sandwich!!
        }
        _sandwich = Builder(name = "Sandwich", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.779f, 14.584f)
                arcTo(1.981f, 1.981f, 0.0f, false, false, 24.0f, 15.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(3.963f, 3.963f, 0.0f, false, true, -2.444f, -0.833f)
                arcToRelative(0.944f, 0.944f, 0.0f, false, false, -1.111f, 0.0f)
                arcToRelative(4.059f, 4.059f, 0.0f, false, true, -4.889f, 0.0f)
                arcToRelative(0.944f, 0.944f, 0.0f, false, false, -1.111f, 0.0f)
                arcToRelative(4.059f, 4.059f, 0.0f, false, true, -4.889f, 0.0f)
                arcToRelative(0.944f, 0.944f, 0.0f, false, false, -1.111f, 0.0f)
                arcToRelative(4.059f, 4.059f, 0.0f, false, true, -4.889f, 0.0f)
                arcToRelative(0.944f, 0.944f, 0.0f, false, false, -1.111f, 0.0f)
                arcTo(3.963f, 3.963f, 0.0f, false, true, 0.0f, 17.0f)
                lineTo(0.0f, 15.0f)
                arcToRelative(1.981f, 1.981f, 0.0f, false, false, 1.222f, -0.417f)
                arcToRelative(2.945f, 2.945f, 0.0f, false, true, 3.557f, 0.0f)
                arcToRelative(2.033f, 2.033f, 0.0f, false, false, 2.443f, 0.0f)
                arcToRelative(2.945f, 2.945f, 0.0f, false, true, 3.557f, 0.0f)
                arcToRelative(2.033f, 2.033f, 0.0f, false, false, 2.443f, 0.0f)
                arcToRelative(2.945f, 2.945f, 0.0f, false, true, 3.557f, 0.0f)
                arcToRelative(2.033f, 2.033f, 0.0f, false, false, 2.443f, 0.0f)
                arcTo(2.945f, 2.945f, 0.0f, false, true, 22.779f, 14.584f)
                close()
                moveTo(24.0f, 7.205f)
                lineTo(24.0f, 13.0f)
                lineTo(0.0f, 13.0f)
                lineTo(0.0f, 6.921f)
                lineTo(15.243f, 0.254f)
                arcToRelative(2.981f, 2.981f, 0.0f, false, true, 3.481f, 0.8f)
                close()
                moveTo(4.807f, 7.0f)
                lineTo(21.191f, 7.0f)
                lineTo(17.2f, 2.351f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.161f, -0.266f)
                close()
                moveTo(22.0f, 11.0f)
                lineTo(22.0f, 9.0f)
                lineTo(2.0f, 9.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(0.0f, 18.0f)
                lineTo(24.0f, 18.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(3.0f, 24.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                close()
                moveTo(2.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                lineTo(21.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(22.0f, 20.0f)
                lineTo(2.0f, 20.0f)
                close()
            }
        }
        .build()
        return _sandwich!!
    }

private var _sandwich: ImageVector? = null
