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

public val Icons.Outline.Seal: ImageVector
    get() {
        if (_seal != null) {
            return _seal!!
        }
        _seal = Builder(name = "Seal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.158f, 9.879f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-2.158f, -2.158f)
                verticalLineToRelative(-1.721f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-1.721f)
                lineToRelative(-2.157f, -2.157f)
                curveToRelative(-1.134f, -1.133f, -3.11f, -1.133f, -4.243f, 0.0f)
                lineToRelative(-2.158f, 2.157f)
                horizontalLineToRelative(-1.721f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(1.721f)
                lineToRelative(-2.158f, 2.158f)
                curveToRelative(-1.168f, 1.17f, -1.168f, 3.072f, 0.0f, 4.242f)
                lineToRelative(2.158f, 2.158f)
                verticalLineToRelative(1.721f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(1.721f)
                lineToRelative(2.157f, 2.157f)
                curveToRelative(0.567f, 0.566f, 1.32f, 0.879f, 2.122f, 0.879f)
                reflectiveCurveToRelative(1.555f, -0.312f, 2.121f, -0.879f)
                lineToRelative(2.158f, -2.157f)
                horizontalLineToRelative(1.721f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-1.721f)
                lineToRelative(2.158f, -2.158f)
                curveToRelative(1.168f, -1.17f, 1.168f, -3.072f, 0.0f, -4.242f)
                close()
                moveTo(21.743f, 12.707f)
                lineToRelative(-2.451f, 2.451f)
                curveToRelative(-0.188f, 0.188f, -0.293f, 0.441f, -0.293f, 0.707f)
                verticalLineToRelative(2.135f)
                curveToRelative(0.0f, 0.552f, -0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.135f)
                curveToRelative(-0.265f, 0.0f, -0.52f, 0.105f, -0.707f, 0.293f)
                lineToRelative(-2.451f, 2.45f)
                curveToRelative(-0.377f, 0.379f, -1.036f, 0.379f, -1.414f, 0.0f)
                lineToRelative(-2.451f, -2.45f)
                curveToRelative(-0.188f, -0.188f, -0.442f, -0.293f, -0.707f, -0.293f)
                horizontalLineToRelative(-2.135f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-2.135f)
                curveToRelative(0.0f, -0.266f, -0.105f, -0.52f, -0.293f, -0.707f)
                lineToRelative(-2.45f, -2.451f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0.0f, -1.414f)
                lineToRelative(2.451f, -2.451f)
                curveToRelative(0.188f, -0.188f, 0.293f, -0.441f, 0.293f, -0.707f)
                verticalLineToRelative(-2.135f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.135f)
                curveToRelative(0.265f, 0.0f, 0.52f, -0.105f, 0.707f, -0.293f)
                lineToRelative(2.451f, -2.45f)
                curveToRelative(0.377f, -0.379f, 1.036f, -0.379f, 1.414f, 0.0f)
                lineToRelative(2.451f, 2.45f)
                curveToRelative(0.188f, 0.188f, 0.442f, 0.293f, 0.707f, 0.293f)
                horizontalLineToRelative(2.135f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(2.135f)
                curveToRelative(0.0f, 0.266f, 0.105f, 0.52f, 0.293f, 0.707f)
                lineToRelative(2.45f, 2.451f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0.0f, 1.414f)
                close()
            }
        }
        .build()
        return _seal!!
    }

private var _seal: ImageVector? = null
