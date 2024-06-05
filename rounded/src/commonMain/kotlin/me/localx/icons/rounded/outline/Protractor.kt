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

public val Icons.Outline.Protractor: ImageVector
    get() {
        if (_protractor != null) {
            return _protractor!!
        }
        _protractor = Builder(name = "Protractor", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.977f, 11.264f)
                horizontalLineToRelative(0.0f)
                curveTo(21.613f, 5.724f, 16.474f, 1.041f, 10.731f, 1.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 3.0f, 4.0f)
                lineTo(3.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(9.0f, 24.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.731f, -1.0f)
                lineTo(11.0f, 23.0f)
                arcToRelative(11.041f, 11.041f, 0.0f, false, false, 8.028f, -3.481f)
                arcTo(10.915f, 10.915f, 0.0f, false, false, 21.977f, 11.264f)
                close()
                moveTo(17.568f, 18.151f)
                arcTo(8.911f, 8.911f, 0.0f, false, true, 11.0f, 21.0f)
                lineTo(10.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                lineTo(7.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(5.0f, 19.0f)
                lineTo(6.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(5.0f, 17.0f)
                lineTo(5.0f, 15.0f)
                lineTo(6.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(5.0f, 13.0f)
                lineTo(5.0f, 11.0f)
                lineTo(6.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 9.0f)
                lineTo(5.0f, 9.0f)
                lineTo(5.0f, 7.0f)
                lineTo(6.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                lineTo(5.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 2.0f)
                lineTo(9.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(0.656f)
                curveToRelative(4.757f, 0.0f, 9.027f, 3.844f, 9.324f, 8.394f)
                arcTo(8.925f, 8.925f, 0.0f, false, true, 17.568f, 18.151f)
                close()
                moveTo(11.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 9.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(2.013f, 2.013f, 0.0f, false, false, 1.976f, 1.989f)
                arcToRelative(5.09f, 5.09f, 0.0f, false, false, 5.0f, -4.5f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 11.0f, 7.0f)
                close()
                moveTo(11.0f, 15.0f)
                lineTo(11.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.986f, 3.3f)
                arcTo(3.089f, 3.089f, 0.0f, false, true, 11.0f, 15.0f)
                close()
            }
        }
        .build()
        return _protractor!!
    }

private var _protractor: ImageVector? = null
