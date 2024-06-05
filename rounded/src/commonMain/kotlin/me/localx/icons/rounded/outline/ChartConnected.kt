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

public val Icons.Outline.ChartConnected: ImageVector
    get() {
        if (_chartConnected != null) {
            return _chartConnected!!
        }
        _chartConnected = Builder(name = "ChartConnected", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.983f)
                arcToRelative(3.994f, 3.994f, 0.0f, false, false, -2.607f, -3.735f)
                lineToRelative(-0.038f, -0.091f)
                arcToRelative(10.07f, 10.07f, 0.0f, false, false, -5.294f, -5.419f)
                lineToRelative(-0.329f, -0.144f)
                arcToRelative(3.981f, 3.981f, 0.0f, false, false, -7.462f, 0.0f)
                lineToRelative(-0.418f, 0.188f)
                arcTo(10.19f, 10.19f, 0.0f, false, false, 2.617f, 8.245f)
                arcToRelative(3.98f, 3.98f, 0.0f, false, false, -0.03f, 7.468f)
                lineToRelative(0.128f, 0.3f)
                arcToRelative(10.1f, 10.1f, 0.0f, false, false, 5.162f, 5.228f)
                lineToRelative(0.393f, 0.176f)
                arcToRelative(3.982f, 3.982f, 0.0f, false, false, 7.46f, 0.0f)
                lineToRelative(0.367f, -0.163f)
                arcToRelative(10.193f, 10.193f, 0.0f, false, false, 5.309f, -5.534f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 24.0f, 11.983f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(3.988f, 9.985f)
                lineToRelative(0.082f, 0.031f)
                lineToRelative(0.01f, -0.025f)
                arcToRelative(1.912f, 1.912f, 0.0f, true, true, -0.092f, -0.006f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 22.0f)
                close()
                moveTo(15.893f, 19.114f)
                arcToRelative(3.991f, 3.991f, 0.0f, false, false, -7.787f, 0.0f)
                arcTo(8.093f, 8.093f, 0.0f, false, true, 4.875f, 15.88f)
                arcTo(3.991f, 3.991f, 0.0f, false, false, 4.9f, 8.1f)
                arcToRelative(8.19f, 8.19f, 0.0f, false, true, 3.206f, -3.2f)
                arcToRelative(3.991f, 3.991f, 0.0f, false, false, 7.785f, 0.0f)
                arcTo(8.225f, 8.225f, 0.0f, false, true, 19.1f, 8.093f)
                arcToRelative(3.991f, 3.991f, 0.0f, false, false, 0.015f, 7.785f)
                arcTo(8.207f, 8.207f, 0.0f, false, true, 15.893f, 19.114f)
                close()
                moveTo(20.0f, 13.983f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 13.983f)
                close()
            }
        }
        .build()
        return _chartConnected!!
    }

private var _chartConnected: ImageVector? = null
