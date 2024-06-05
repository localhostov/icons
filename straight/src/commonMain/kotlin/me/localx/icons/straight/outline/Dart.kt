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

public val Icons.Outline.Dart: ImageVector
    get() {
        if (_dart != null) {
            return _dart!!
        }
        _dart = Builder(name = "Dart", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                horizontalLineToRelative(-4.414f)
                lineToRelative(-5.586f, 5.586f)
                verticalLineToRelative(5.119f)
                curveToRelative(-3.266f, 2.415f, -7.581f, 5.633f, -8.121f, 6.174f)
                arcToRelative(2.993f, 2.993f, 0.0f, false, false, -0.577f, 3.4f)
                lineToRelative(-2.302f, 2.307f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.3f, -2.3f)
                arcToRelative(2.965f, 2.965f, 0.0f, false, false, 3.407f, -0.579f)
                curveToRelative(0.541f, -0.541f, 3.759f, -4.855f, 6.179f, -8.121f)
                horizontalLineToRelative(5.119f)
                lineToRelative(5.581f, -5.586f)
                verticalLineToRelative(-4.414f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                close()
                moveTo(5.707f, 19.707f)
                arcToRelative(1.021f, 1.021f, 0.0f, false, true, -1.414f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.414f)
                curveToRelative(0.339f, -0.336f, 3.0f, -2.343f, 5.948f, -4.534f)
                curveToRelative(-2.192f, 2.947f, -4.199f, 5.61f, -4.534f, 5.948f)
                close()
                moveTo(22.0f, 6.586f)
                lineTo(17.586f, 11.0f)
                horizontalLineToRelative(-2.815f)
                lineToRelative(0.991f, -1.348f)
                lineToRelative(4.945f, -4.945f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-4.944f, 4.944f)
                lineToRelative(-1.349f, 0.992f)
                verticalLineToRelative(-2.815f)
                lineToRelative(4.414f, -4.414f)
                horizontalLineToRelative(3.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _dart!!
    }

private var _dart: ImageVector? = null
