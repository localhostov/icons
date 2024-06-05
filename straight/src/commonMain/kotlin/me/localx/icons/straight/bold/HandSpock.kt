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

public val Icons.Bold.HandSpock: ImageVector
    get() {
        if (_handSpock != null) {
            return _handSpock!!
        }
        _handSpock = Builder(name = "HandSpock", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.974f, 3.781f)
                lineToRelative(-1.974f, 10.361f)
                verticalLineToRelative(9.858f)
                horizontalLineToRelative(-13.082f)
                lineTo(0.747f, 16.609f)
                curveToRelative(-0.866f, -0.722f, -0.983f, -2.008f, -0.261f, -2.874f)
                curveToRelative(0.722f, -0.866f, 2.008f, -0.983f, 2.874f, -0.261f)
                lineToRelative(2.64f, 2.489f)
                verticalLineToRelative(-1.807f)
                lineTo(3.847f, 3.806f)
                curveToRelative(-0.186f, -0.892f, 0.464f, -1.765f, 1.415f, -1.806f)
                curveToRelative(0.746f, -0.032f, 1.386f, 0.542f, 1.539f, 1.273f)
                curveToRelative(0.0f, 0.0f, 2.189f, 10.624f, 2.199f, 10.727f)
                verticalLineToRelative(6.011f)
                lineToRelative(1.082f, 0.989f)
                horizontalLineToRelative(8.918f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.009f, -0.094f, 2.026f, -10.781f, 2.026f, -10.781f)
                curveToRelative(0.154f, -0.814f, 0.945f, -1.347f, 1.754f, -1.193f)
                curveToRelative(0.814f, 0.155f, 1.349f, 0.94f, 1.193f, 1.754f)
                close()
                moveTo(19.289f, 1.779f)
                curveToRelative(0.154f, -0.814f, -0.381f, -1.599f, -1.195f, -1.752f)
                curveToRelative(-0.811f, -0.157f, -1.599f, 0.381f, -1.752f, 1.195f)
                lineToRelative(-1.865f, 9.779f)
                horizontalLineToRelative(3.068f)
                lineToRelative(1.744f, -9.221f)
                close()
                moveTo(10.449f, 11.0f)
                horizontalLineToRelative(3.037f)
                lineTo(11.469f, 1.194f)
                curveToRelative(-0.17f, -0.811f, -0.962f, -1.329f, -1.775f, -1.162f)
                curveToRelative(-0.811f, 0.169f, -1.331f, 0.963f, -1.162f, 1.774f)
                lineToRelative(1.918f, 9.194f)
                close()
            }
        }
        .build()
        return _handSpock!!
    }

private var _handSpock: ImageVector? = null
