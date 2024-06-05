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

public val Icons.Outline.Pie: ImageVector
    get() {
        if (_pie != null) {
            return _pie!!
        }
        _pie = Builder(name = "Pie", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 14.0f)
                curveToRelative(0.0f, -3.624f, -5.353f, -8.0f, -12.0f, -8.0f)
                reflectiveCurveTo(0.0f, 10.376f, 0.0f, 14.0f)
                arcToRelative(2.946f, 2.946f, 0.0f, false, false, 2.142f, 2.887f)
                lineToRelative(0.532f, 2.989f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.6f, 24.0f)
                lineTo(16.4f, 24.0f)
                arcToRelative(4.992f, 4.992f, 0.0f, false, false, 4.922f, -4.125f)
                lineToRelative(0.532f, -2.988f)
                arcTo(2.946f, 2.946f, 0.0f, false, false, 24.0f, 14.0f)
                close()
                moveTo(16.4f, 22.0f)
                lineTo(7.6f, 22.0f)
                arcToRelative(3.213f, 3.213f, 0.0f, false, true, -3.1f, -3.3f)
                arcTo(4.015f, 4.015f, 0.0f, false, false, 9.0f, 17.648f)
                arcToRelative(4.038f, 4.038f, 0.0f, false, false, 6.0f, 0.0f)
                arcTo(4.015f, 4.015f, 0.0f, false, false, 19.5f, 18.7f)
                arcTo(3.211f, 3.211f, 0.0f, false, true, 16.4f, 22.0f)
                close()
                moveTo(21.0f, 15.0f)
                arcToRelative(1.57f, 1.57f, 0.0f, false, false, -0.406f, 0.09f)
                arcToRelative(1.232f, 1.232f, 0.0f, false, false, -0.75f, 0.688f)
                arcToRelative(2.015f, 2.015f, 0.0f, false, true, -3.687f, 0.0f)
                arcToRelative(1.259f, 1.259f, 0.0f, false, false, -2.313f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.687f, 0.0f)
                arcToRelative(1.259f, 1.259f, 0.0f, false, false, -2.313f, 0.0f)
                arcToRelative(2.015f, 2.015f, 0.0f, false, true, -3.687f, 0.0f)
                arcToRelative(1.236f, 1.236f, 0.0f, false, false, -0.751f, -0.691f)
                curveTo(3.4f, 15.085f, 3.04f, 15.0f, 3.0f, 15.0f)
                arcToRelative(0.915f, 0.915f, 0.0f, false, true, -1.0f, -1.0f)
                curveToRelative(0.0f, -2.369f, 4.479f, -6.0f, 10.0f, -6.0f)
                reflectiveCurveToRelative(10.0f, 3.631f, 10.0f, 5.988f)
                arcTo(0.918f, 0.918f, 0.0f, false, true, 21.0f, 15.0f)
                close()
                moveTo(11.0f, 3.0f)
                lineTo(11.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(13.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 3.0f)
                close()
                moveTo(15.0f, 3.0f)
                lineTo(15.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(17.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 3.0f)
                close()
                moveTo(7.0f, 3.0f)
                lineTo(7.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 1.0f)
                lineTo(9.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 3.0f)
                close()
                moveTo(10.985f, 10.65f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -0.752f, 1.967f)
                arcToRelative(1.308f, 1.308f, 0.0f, false, true, -1.85f, -1.85f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, 1.967f, -0.752f)
                arcTo(0.526f, 0.526f, 0.0f, false, true, 10.985f, 10.65f)
                close()
                moveTo(15.617f, 10.767f)
                arcToRelative(1.308f, 1.308f, 0.0f, false, true, -1.85f, 1.85f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -0.752f, -1.967f)
                arcToRelative(0.526f, 0.526f, 0.0f, false, true, 0.635f, -0.635f)
                arcTo(5.4f, 5.4f, 0.0f, false, true, 15.617f, 10.767f)
                close()
            }
        }
        .build()
        return _pie!!
    }

private var _pie: ImageVector? = null
