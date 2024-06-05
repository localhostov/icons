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

public val Icons.Bold.StageTheatre: ImageVector
    get() {
        if (_stageTheatre != null) {
            return _stageTheatre!!
        }
        _stageTheatre = Builder(name = "StageTheatre", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                curveTo(2.467f, 0.0f, 0.0f, 2.468f, 0.0f, 5.5f)
                verticalLineToRelative(8.969f)
                curveToRelative(0.0f, 0.02f, 0.0f, 0.04f, 0.0f, 0.061f)
                verticalLineToRelative(5.971f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(3.087f)
                curveToRelative(0.744f, 0.0f, 1.436f, -0.336f, 1.897f, -0.923f)
                curveToRelative(0.459f, -0.584f, 0.623f, -1.331f, 0.448f, -2.05f)
                curveToRelative(-0.557f, -2.297f, -2.008f, -4.13f, -3.423f, -5.449f)
                curveToRelative(2.294f, -1.248f, 5.045f, -3.544f, 6.491f, -7.685f)
                curveToRelative(1.446f, 4.141f, 4.197f, 6.437f, 6.491f, 7.685f)
                curveToRelative(-1.415f, 1.319f, -2.866f, 3.151f, -3.424f, 5.449f)
                curveToRelative(-0.174f, 0.719f, -0.01f, 1.466f, 0.449f, 2.05f)
                curveToRelative(0.461f, 0.587f, 1.153f, 0.923f, 1.897f, 0.923f)
                horizontalLineToRelative(3.087f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-5.971f)
                curveToRelative(0.0f, -0.021f, 0.0f, -0.041f, 0.0f, -0.061f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -3.032f, -2.467f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(5.786f, 21.0f)
                horizontalLineToRelative(-2.286f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                verticalLineToRelative(-3.135f)
                curveToRelative(1.05f, 0.891f, 2.204f, 2.132f, 2.786f, 3.635f)
                close()
                moveTo(3.0f, 13.494f)
                verticalLineToRelative(-7.994f)
                curveToRelative(0.0f, -1.208f, 0.86f, -2.217f, 2.0f, -2.449f)
                verticalLineToRelative(4.254f)
                curveToRelative(0.0f, 0.703f, 0.914f, 0.978f, 1.303f, 0.392f)
                curveToRelative(0.803f, -1.208f, 1.403f, -2.756f, 1.611f, -4.697f)
                horizontalLineToRelative(2.013f)
                curveToRelative(-0.523f, 6.888f, -4.55f, 9.534f, -6.928f, 10.494f)
                close()
                moveTo(14.072f, 3.0f)
                horizontalLineToRelative(2.013f)
                curveToRelative(0.208f, 1.941f, 0.808f, 3.489f, 1.611f, 4.697f)
                curveToRelative(0.39f, 0.586f, 1.303f, 0.311f, 1.303f, -0.392f)
                lineTo(18.999f, 3.051f)
                curveToRelative(1.14f, 0.232f, 2.0f, 1.242f, 2.0f, 2.449f)
                verticalLineToRelative(7.994f)
                curveToRelative(-2.381f, -0.962f, -6.405f, -3.609f, -6.928f, -10.494f)
                close()
                moveTo(21.0f, 20.5f)
                curveToRelative(0.0f, 0.275f, -0.224f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-2.286f)
                curveToRelative(0.583f, -1.514f, 1.736f, -2.756f, 2.786f, -3.643f)
                verticalLineToRelative(3.143f)
                close()
            }
        }
        .build()
        return _stageTheatre!!
    }

private var _stageTheatre: ImageVector? = null
