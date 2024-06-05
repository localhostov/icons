package me.localx.icons.straight.outline

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

public val Icons.Outline.CowbellMore: ImageVector
    get() {
        if (_cowbellMore != null) {
            return _cowbellMore!!
        }
        _cowbellMore = Builder(name = "CowbellMore", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 20.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 22.0f)
                horizontalLineToRelative(3.44f)
                curveToRelative(-0.69f, 1.19f, -1.97f, 2.0f, -3.44f, 2.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                lineTo(0.81f, 20.0f)
                lineTo(3.07f, 7.3f)
                curveToRelative(0.34f, -1.91f, 2.0f, -3.3f, 3.94f, -3.3f)
                horizontalLineToRelative(0.16f)
                curveToRelative(-0.11f, -0.31f, -0.17f, -0.65f, -0.17f, -1.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                curveToRelative(0.0f, 0.35f, -0.06f, 0.69f, -0.17f, 1.0f)
                horizontalLineToRelative(0.16f)
                curveToRelative(1.94f, 0.0f, 3.6f, 1.39f, 3.94f, 3.3f)
                lineToRelative(0.84f, 4.7f)
                horizontalLineToRelative(-2.03f)
                lineToRelative(-0.78f, -4.35f)
                curveToRelative(-0.17f, -0.96f, -1.0f, -1.65f, -1.97f, -1.65f)
                lineTo(7.01f, 6.0f)
                curveToRelative(-0.97f, 0.0f, -1.8f, 0.69f, -1.97f, 1.65f)
                lineToRelative(-1.85f, 10.35f)
                lineTo(12.08f, 18.0f)
                curveToRelative(-0.05f, 0.33f, -0.08f, 0.66f, -0.08f, 1.0f)
                reflectiveCurveToRelative(0.03f, 0.67f, 0.07f, 1.0f)
                horizontalLineToRelative(-2.07f)
                curveToRelative(0.0f, 1.1f, 1.0f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(10.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _cowbellMore!!
    }

private var _cowbellMore: ImageVector? = null
