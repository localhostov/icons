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

public val Icons.Filled.HandBackPointRight: ImageVector
    get() {
        if (_handBackPointRight != null) {
            return _handBackPointRight!!
        }
        _handBackPointRight = Builder(name = "HandBackPointRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 8.001f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.389f)
                lineToRelative(-3.025f, -3.121f)
                curveToRelative(-0.702f, -0.703f, -1.706f, -1.013f, -2.682f, -0.828f)
                curveToRelative(-0.625f, 0.126f, -1.196f, 0.44f, -1.637f, 0.9f)
                lineTo(0.0f, 8.001f)
                verticalLineToRelative(14.0f)
                horizontalLineTo(13.806f)
                lineToRelative(2.014f, -9.0f)
                horizontalLineToRelative(5.681f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _handBackPointRight!!
    }

private var _handBackPointRight: ImageVector? = null
