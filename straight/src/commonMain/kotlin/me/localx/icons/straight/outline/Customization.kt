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

public val Icons.Outline.Customization: ImageVector
    get() {
        if (_customization != null) {
            return _customization!!
        }
        _customization = Builder(name = "Customization", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.836f, 13.309f)
                lineToRelative(-3.536f, -0.944f)
                lineToRelative(-1.835f, 3.635f)
                lineToRelative(-0.864f, -0.154f)
                lineToRelative(-0.344f, -2.689f)
                lineTo(1.47f, 23.944f)
                lineTo(0.056f, 22.53f)
                lineToRelative(10.771f, -10.771f)
                lineToRelative(-2.669f, -0.341f)
                lineToRelative(-0.121f, -0.858f)
                lineToRelative(3.651f, -1.881f)
                lineToRelative(-1.001f, -3.509f)
                lineToRelative(0.626f, -0.626f)
                lineToRelative(2.952f, 2.952f)
                lineToRelative(3.854f, -2.255f)
                lineToRelative(0.659f, 0.659f)
                lineToRelative(-2.256f, 3.852f)
                lineToRelative(2.936f, 2.936f)
                lineToRelative(-0.622f, 0.622f)
                close()
                moveTo(21.5f, 0.0f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.379f, -1.121f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(22.0f, 16.5f)
                curveToRelative(0.0f, 0.275f, -0.225f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(7.0f, 2.5f)
                curveToRelative(0.0f, -0.275f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.5f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.5f)
                close()
            }
        }
        .build()
        return _customization!!
    }

private var _customization: ImageVector? = null
