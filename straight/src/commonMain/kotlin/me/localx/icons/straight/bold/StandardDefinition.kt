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

public val Icons.Bold.StandardDefinition: ImageVector
    get() {
        if (_standardDefinition != null) {
            return _standardDefinition!!
        }
        _standardDefinition = Builder(name = "StandardDefinition", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 2.0f)
                lineTo(3.5f, 2.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 19.0f)
                lineTo(3.0f, 19.0f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                close()
                moveTo(16.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(17.0f, 14.0f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(11.0f, 9.75f)
                verticalLineToRelative(0.345f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.345f)
                curveToRelative(0.0f, -0.414f, -0.337f, -0.75f, -0.751f, -0.75f)
                horizontalLineToRelative(-0.475f)
                curveToRelative(-0.414f, 0.0f, -0.751f, 0.337f, -0.751f, 0.75f)
                curveToRelative(0.0f, 0.488f, 0.475f, 0.81f, 1.48f, 1.379f)
                curveToRelative(1.054f, 0.596f, 2.496f, 1.412f, 2.496f, 3.12f)
                curveToRelative(0.0f, 1.517f, -1.234f, 2.75f, -2.751f, 2.75f)
                horizontalLineToRelative(-0.475f)
                curveToRelative(-1.517f, 0.0f, -2.751f, -1.234f, -2.751f, -2.75f)
                verticalLineToRelative(-0.345f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.345f)
                curveToRelative(0.0f, 0.414f, 0.337f, 0.75f, 0.751f, 0.75f)
                horizontalLineToRelative(0.475f)
                curveToRelative(0.414f, 0.0f, 0.751f, -0.337f, 0.751f, -0.75f)
                curveToRelative(0.0f, -0.488f, -0.475f, -0.81f, -1.48f, -1.379f)
                curveToRelative(-1.054f, -0.596f, -2.496f, -1.412f, -2.496f, -3.12f)
                curveToRelative(0.0f, -1.517f, 1.234f, -2.75f, 2.751f, -2.75f)
                horizontalLineToRelative(0.475f)
                curveToRelative(1.517f, 0.0f, 2.751f, 1.234f, 2.751f, 2.75f)
                close()
            }
        }
        .build()
        return _standardDefinition!!
    }

private var _standardDefinition: ImageVector? = null
