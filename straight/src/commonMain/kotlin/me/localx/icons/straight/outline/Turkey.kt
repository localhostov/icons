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

public val Icons.Outline.Turkey: ImageVector
    get() {
        if (_turkey != null) {
            return _turkey!!
        }
        _turkey = Builder(name = "Turkey", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                lineTo(7.0f, 4.0f)
                lineTo(7.0f, 0.0f)
                lineTo(9.0f, 0.0f)
                close()
                moveTo(13.0f, 0.0f)
                lineTo(11.0f, 0.0f)
                lineTo(11.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(5.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                lineTo(3.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                close()
                moveTo(24.0f, 18.0f)
                curveToRelative(0.0f, 5.221f, -9.4f, 6.0f, -15.0f, 6.0f)
                arcTo(81.716f, 81.716f, 0.0f, false, true, 0.835f, 22.986f)
                lineTo(0.0f, 22.847f)
                lineTo(0.0f, 16.0f)
                arcTo(9.01f, 9.01f, 0.0f, false, true, 9.0f, 7.0f)
                arcToRelative(18.144f, 18.144f, 0.0f, false, true, 2.409f, 0.164f)
                arcTo(17.517f, 17.517f, 0.0f, false, true, 17.091f, 6.0f)
                lineToRelative(0.434f, -0.014f)
                lineToRelative(0.538f, 0.537f)
                lineToRelative(1.716f, -1.715f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.063f, -0.65f)
                arcTo(1.485f, 1.485f, 0.0f, false, true, 22.5f, 4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -1.307f, 2.222f)
                lineTo(19.477f, 7.937f)
                lineToRelative(0.538f, 0.538f)
                lineTo(20.0f, 8.909f)
                curveToRelative(-0.006f, 0.19f, -0.04f, 0.9f, -0.164f, 1.833f)
                curveTo(22.442f, 12.856f, 24.0f, 15.548f, 24.0f, 18.0f)
                close()
                moveTo(10.0f, 12.312f)
                arcToRelative(3.667f, 3.667f, 0.0f, false, false, 1.08f, 2.608f)
                arcToRelative(3.777f, 3.777f, 0.0f, false, false, 5.215f, 0.0f)
                curveToRelative(1.145f, -1.146f, 1.577f, -4.153f, 1.683f, -5.653f)
                lineTo(16.733f, 8.022f)
                curveToRelative(-1.5f, 0.106f, -4.507f, 0.537f, -5.653f, 1.683f)
                arcTo(3.667f, 3.667f, 0.0f, false, false, 10.0f, 12.312f)
                close()
                moveTo(22.0f, 18.0f)
                arcToRelative(7.516f, 7.516f, 0.0f, false, false, -2.613f, -4.988f)
                arcToRelative(7.543f, 7.543f, 0.0f, false, true, -1.678f, 3.322f)
                arcTo(5.678f, 5.678f, 0.0f, false, true, 9.081f, 9.0f)
                arcTo(7.075f, 7.075f, 0.0f, false, false, 2.0f, 16.0f)
                verticalLineToRelative(5.149f)
                arcTo(68.5f, 68.5f, 0.0f, false, false, 9.0f, 22.0f)
                curveTo(15.0f, 22.0f, 22.0f, 20.953f, 22.0f, 18.0f)
                close()
            }
        }
        .build()
        return _turkey!!
    }

private var _turkey: ImageVector? = null
