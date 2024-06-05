package me.localx.icons.rounded.bold

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

public val Icons.Bold.Couch: ImageVector
    get() {
        if (_couch != null) {
            return _couch!!
        }
        _couch = Builder(name = "Couch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 8.051f)
                verticalLineToRelative(-1.551f)
                curveToRelative(0.0f, -3.033f, -2.467f, -5.5f, -5.5f, -5.5f)
                lineTo(7.5f, 1.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, 2.467f, -5.5f, 5.5f)
                verticalLineToRelative(1.551f)
                curveToRelative(-1.14f, 0.232f, -2.0f, 1.242f, -2.0f, 2.449f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.704f, 0.779f, 3.23f, 2.0f, 4.239f)
                verticalLineToRelative(1.761f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-0.525f)
                curveToRelative(0.165f, 0.015f, 0.331f, 0.025f, 0.5f, 0.025f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.169f, 0.0f, 0.335f, -0.01f, 0.5f, -0.025f)
                verticalLineToRelative(0.525f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-1.761f)
                curveToRelative(1.221f, -1.01f, 2.0f, -2.535f, 2.0f, -4.239f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.207f, -0.86f, -2.217f, -2.0f, -2.449f)
                close()
                moveTo(5.0f, 6.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(6.5f)
                lineTo(5.0f, 13.0f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(18.5f, 18.0f)
                lineTo(5.5f, 18.0f)
                curveToRelative(-1.233f, 0.0f, -2.26f, -0.897f, -2.463f, -2.073f)
                curveToRelative(0.132f, 0.038f, 0.319f, 0.073f, 0.463f, 0.073f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.144f, 0.0f, 0.331f, -0.035f, 0.463f, -0.073f)
                curveToRelative(-0.203f, 1.176f, -1.23f, 2.073f, -2.463f, 2.073f)
                close()
            }
        }
        .build()
        return _couch!!
    }

private var _couch: ImageVector? = null
