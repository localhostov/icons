package me.localx.icons.rounded.filled

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

public val Icons.Filled.FighterJet: ImageVector
    get() {
        if (_fighterJet != null) {
            return _fighterJet!!
        }
        _fighterJet = Builder(name = "FighterJet", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 9.0f)
                lineTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                reflectiveCurveToRelative(-2.355f, -0.022f, -2.442f, 0.0f)
                arcTo(3.043f, 3.043f, 0.0f, false, false, 8.0f, 3.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                lineTo(3.01f, 6.613f)
                arcTo(1.712f, 1.712f, 0.0f, false, false, 0.0f, 7.7f)
                verticalLineToRelative(8.6f)
                arcToRelative(1.712f, 1.712f, 0.0f, false, false, 3.01f, 1.089f)
                lineTo(5.0f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(3.051f, 3.051f, 0.0f, false, false, 2.5f, 3.0f)
                curveToRelative(0.1f, 0.031f, 2.5f, 0.0f, 2.5f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(11.0f)
                lineToRelative(4.5f, -7.0f)
                curveToRelative(3.958f, -0.294f, 8.5f, -0.674f, 8.5f, -3.0f)
                reflectiveCurveTo(19.459f, 9.281f, 15.5f, 9.0f)
                close()
            }
        }
        .build()
        return _fighterJet!!
    }

private var _fighterJet: ImageVector? = null
