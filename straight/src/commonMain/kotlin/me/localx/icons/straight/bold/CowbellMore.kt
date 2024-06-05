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

public val Icons.Bold.CowbellMore: ImageVector
    get() {
        if (_cowbellMore != null) {
            return _cowbellMore!!
        }
        _cowbellMore = Builder(name = "CowbellMore", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 21.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(5.5f, 9.22f)
                lineToRelative(-1.69f, 8.78f)
                lineTo(13.0f, 18.0f)
                verticalLineToRelative(5.86f)
                curveToRelative(-0.32f, 0.08f, -0.65f, 0.14f, -1.0f, 0.14f)
                curveToRelative(-1.86f, 0.0f, -3.41f, -1.28f, -3.86f, -3.0f)
                lineTo(0.18f, 21.0f)
                lineTo(2.56f, 8.65f)
                curveToRelative(0.41f, -2.12f, 2.26f, -3.65f, 4.42f, -3.65f)
                horizontalLineToRelative(0.15f)
                curveToRelative(-0.08f, -0.32f, -0.13f, -0.65f, -0.13f, -1.0f)
                curveTo(7.0f, 1.79f, 8.79f, 0.0f, 11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                curveToRelative(0.0f, 0.35f, -0.04f, 0.68f, -0.13f, 1.0f)
                horizontalLineToRelative(0.15f)
                curveToRelative(2.15f, 0.0f, 4.01f, 1.54f, 4.42f, 3.65f)
                lineToRelative(0.84f, 4.35f)
                horizontalLineToRelative(-3.05f)
                lineToRelative(-0.73f, -3.78f)
                curveToRelative(-0.14f, -0.71f, -0.76f, -1.22f, -1.47f, -1.22f)
                lineTo(6.98f, 8.0f)
                curveToRelative(-0.72f, 0.0f, -1.34f, 0.51f, -1.47f, 1.22f)
                close()
                moveTo(11.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _cowbellMore!!
    }

private var _cowbellMore: ImageVector? = null
