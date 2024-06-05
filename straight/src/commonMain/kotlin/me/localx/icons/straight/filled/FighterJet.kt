package me.localx.icons.straight.filled

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
                moveTo(15.0f, 9.0f)
                lineTo(10.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                lineTo(2.9f, 7.343f)
                curveTo(2.346f, 6.5f, 2.0f, 6.0f, 0.987f, 6.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(0.415f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.5f, -1.347f)
                lineTo(4.0f, 15.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(10.0f)
                lineToRelative(5.0f, -7.0f)
                curveToRelative(3.958f, -0.294f, 9.0f, -0.674f, 9.0f, -3.0f)
                reflectiveCurveTo(18.959f, 9.281f, 15.0f, 9.0f)
                close()
            }
        }
        .build()
        return _fighterJet!!
    }

private var _fighterJet: ImageVector? = null
