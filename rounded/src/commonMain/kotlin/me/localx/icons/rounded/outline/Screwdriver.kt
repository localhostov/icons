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

public val Icons.Outline.Screwdriver: ImageVector
    get() {
        if (_screwdriver != null) {
            return _screwdriver!!
        }
        _screwdriver = Builder(name = "Screwdriver", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.302f, 1.724f)
                lineToRelative(-1.026f, -1.027f)
                curveToRelative(-0.761f, -0.759f, -1.943f, -0.915f, -2.873f, -0.378f)
                lineToRelative(-2.98f, 1.72f)
                curveToRelative(-0.877f, 0.506f, -1.422f, 1.449f, -1.422f, 2.462f)
                verticalLineToRelative(3.086f)
                lineToRelative(-4.832f, 4.832f)
                curveToRelative(-1.327f, -0.711f, -3.02f, -0.51f, -4.14f, 0.606f)
                lineToRelative(-4.913f, 4.899f)
                curveToRelative(-1.317f, 1.312f, -1.468f, 3.415f, -0.342f, 4.787f)
                curveToRelative(0.63f, 0.768f, 1.78f, 1.289f, 2.718f, 1.289f)
                curveToRelative(0.927f, 0.0f, 1.822f, -0.368f, 2.48f, -1.024f)
                lineToRelative(5.014f, -5.0f)
                curveToRelative(0.663f, -0.661f, 1.028f, -1.54f, 1.028f, -2.476f)
                curveToRelative(0.0f, -0.595f, -0.148f, -1.167f, -0.426f, -1.674f)
                lineToRelative(4.826f, -4.826f)
                horizontalLineToRelative(3.086f)
                curveToRelative(1.013f, 0.0f, 1.956f, -0.545f, 2.462f, -1.423f)
                lineToRelative(1.719f, -2.98f)
                curveToRelative(0.537f, -0.931f, 0.382f, -2.112f, -0.379f, -2.873f)
                close()
                moveTo(9.574f, 16.56f)
                lineToRelative(-5.015f, 5.0f)
                curveToRelative(-0.3f, 0.3f, -0.718f, 0.451f, -1.142f, 0.438f)
                curveToRelative(-0.431f, -0.021f, -0.821f, -0.219f, -1.098f, -0.557f)
                curveToRelative(-0.479f, -0.584f, -0.388f, -1.507f, 0.208f, -2.102f)
                lineToRelative(4.913f, -4.899f)
                curveToRelative(0.294f, -0.293f, 0.681f, -0.44f, 1.066f, -0.44f)
                reflectiveCurveToRelative(0.772f, 0.147f, 1.067f, 0.44f)
                curveToRelative(0.284f, 0.283f, 0.44f, 0.659f, 0.44f, 1.06f)
                reflectiveCurveToRelative(-0.157f, 0.776f, -0.44f, 1.06f)
                close()
                moveTo(21.948f, 3.598f)
                lineToRelative(-1.719f, 2.98f)
                curveToRelative(-0.15f, 0.261f, -0.43f, 0.422f, -0.729f, 0.422f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.3f, 0.161f, -0.579f, 0.422f, -0.729f)
                lineToRelative(2.98f, -1.72f)
                curveToRelative(0.151f, -0.086f, 0.34f, -0.061f, 0.46f, 0.061f)
                lineToRelative(1.025f, 1.026f)
                curveToRelative(0.121f, 0.122f, 0.146f, 0.311f, 0.061f, 0.46f)
                close()
            }
        }
        .build()
        return _screwdriver!!
    }

private var _screwdriver: ImageVector? = null
