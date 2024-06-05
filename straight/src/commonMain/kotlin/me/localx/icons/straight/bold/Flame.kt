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

public val Icons.Bold.Flame: ImageVector
    get() {
        if (_flame != null) {
            return _flame!!
        }
        _flame = Builder(name = "Flame", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.514f, 4.213f)
                curveToRelative(-1.122f, -0.953f, -2.282f, -1.937f, -3.446f, -3.1f)
                lineTo(12.0f, 0.048f)
                lineTo(10.941f, 1.114f)
                arcToRelative(14.411f, 14.411f, 0.0f, false, false, -3.317f, 6.1f)
                curveToRelative(-0.015f, -0.052f, -0.029f, -0.1f, -0.043f, -0.157f)
                lineTo(6.947f, 4.6f)
                lineTo(5.1f, 6.334f)
                curveTo(3.245f, 8.073f, 1.531f, 10.154f, 1.53f, 13.58f)
                arcTo(10.376f, 10.376f, 0.0f, false, false, 9.3f, 23.711f)
                arcToRelative(10.984f, 10.984f, 0.0f, false, false, 2.69f, 0.337f)
                arcTo(10.464f, 10.464f, 0.0f, false, false, 22.47f, 13.582f)
                curveTo(22.47f, 9.27f, 19.709f, 6.926f, 16.514f, 4.213f)
                close()
                moveTo(16.583f, 19.474f)
                curveToRelative(-0.109f, 0.084f, -0.225f, 0.154f, -0.337f, 0.232f)
                arcToRelative(4.584f, 4.584f, 0.0f, false, false, 0.35f, -1.753f)
                curveToRelative(0.0f, -2.539f, -2.3f, -3.552f, -4.6f, -5.85f)
                curveToRelative(-2.507f, 2.507f, -4.6f, 3.311f, -4.6f, 5.85f)
                arcTo(4.574f, 4.574f, 0.0f, false, false, 7.8f, 19.8f)
                arcTo(7.469f, 7.469f, 0.0f, false, true, 4.536f, 13.58f)
                arcToRelative(5.463f, 5.463f, 0.0f, false, true, 1.137f, -3.449f)
                curveToRelative(0.109f, 0.172f, 0.224f, 0.338f, 0.346f, 0.5f)
                arcToRelative(2.253f, 2.253f, 0.0f, false, false, 2.32f, 0.854f)
                arcTo(2.314f, 2.314f, 0.0f, false, false, 10.1f, 9.7f)
                arcToRelative(15.809f, 15.809f, 0.0f, false, true, 2.043f, -5.316f)
                curveToRelative(0.844f, 0.776f, 1.67f, 1.477f, 2.426f, 2.12f)
                curveToRelative(3.218f, 2.731f, 4.9f, 4.287f, 4.9f, 7.078f)
                arcTo(7.423f, 7.423f, 0.0f, false, true, 16.583f, 19.474f)
                close()
            }
        }
        .build()
        return _flame!!
    }

private var _flame: ImageVector? = null
