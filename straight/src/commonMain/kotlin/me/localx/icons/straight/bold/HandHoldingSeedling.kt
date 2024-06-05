package me.localx.icons.straight.bold

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

public val Icons.Bold.HandHoldingSeedling: ImageVector
    get() {
        if (_handHoldingSeedling != null) {
            return _handHoldingSeedling!!
        }
        _handHoldingSeedling = Builder(name = "HandHoldingSeedling", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.193f, 15.543f)
                lineToRelative(-4.929f, 4.859f)
                curveToRelative(-2.354f, 2.32f, -5.47f, 3.598f, -8.775f, 3.598f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(9.489f)
                curveToRelative(2.383f, 0.0f, 4.637f, -0.874f, 6.389f, -2.469f)
                curveToRelative(-0.56f, 0.299f, -1.2f, 0.469f, -1.878f, 0.469f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-6.188f)
                curveToRelative(-2.27f, 0.0f, -4.404f, 0.884f, -6.011f, 2.489f)
                lineToRelative(-0.616f, 0.617f)
                lineTo(0.062f, 14.987f)
                lineToRelative(0.617f, -0.618f)
                curveToRelative(2.174f, -2.173f, 5.062f, -3.369f, 8.133f, -3.369f)
                horizontalLineToRelative(9.188f)
                verticalLineToRelative(2.227f)
                lineToRelative(1.53f, -1.474f)
                curveToRelative(0.527f, -0.528f, 1.286f, -0.81f, 2.056f, -0.744f)
                curveToRelative(0.771f, 0.062f, 1.476f, 0.46f, 1.932f, 1.093f)
                curveToRelative(0.745f, 1.035f, 0.604f, 2.515f, -0.324f, 3.441f)
                close()
                moveTo(11.0f, 7.379f)
                verticalLineToRelative(1.621f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.621f)
                curveToRelative(3.897f, -0.518f, 5.5f, -2.747f, 5.5f, -7.379f)
                curveToRelative(-3.897f, 0.0f, -6.092f, 1.134f, -7.0f, 3.814f)
                curveToRelative(-0.908f, -2.68f, -3.103f, -3.814f, -7.0f, -3.814f)
                curveToRelative(0.0f, 4.632f, 1.603f, 6.861f, 5.5f, 7.379f)
                close()
            }
        }
        .build()
        return _handHoldingSeedling!!
    }

private var _handHoldingSeedling: ImageVector? = null
