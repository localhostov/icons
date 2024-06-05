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

public val Icons.Outline.WrenchSimple: ImageVector
    get() {
        if (_wrenchSimple != null) {
            return _wrenchSimple!!
        }
        _wrenchSimple = Builder(name = "WrenchSimple", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 24.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.193f)
                lineToRelative(0.7f, -0.22f)
                curveToRelative(3.769f, -1.184f, 6.3f, -4.635f, 6.3f, -8.587f)
                curveToRelative(0.0f, -3.479f, -1.961f, -6.568f, -5.0f, -8.066f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(2.934f)
                curveToRelative(-3.039f, 1.498f, -5.0f, 4.588f, -5.0f, 8.066f)
                curveToRelative(0.0f, 3.952f, 2.531f, 7.403f, 6.3f, 8.587f)
                lineToRelative(0.7f, 0.22f)
                verticalLineToRelative(4.193f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.751f)
                curveTo(3.783f, 19.611f, 1.0f, 15.581f, 1.0f, 11.0f)
                curveTo(1.0f, 6.17f, 4.095f, 1.952f, 8.7f, 0.505f)
                lineToRelative(1.3f, -0.408f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(0.097f)
                lineToRelative(1.3f, 0.408f)
                curveToRelative(4.605f, 1.447f, 7.7f, 5.665f, 7.7f, 10.495f)
                curveToRelative(0.0f, 4.581f, -2.783f, 8.611f, -7.0f, 10.249f)
                verticalLineToRelative(2.751f)
                close()
            }
        }
        .build()
        return _wrenchSimple!!
    }

private var _wrenchSimple: ImageVector? = null
