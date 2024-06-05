package me.localx.icons.rounded.filled

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

public val Icons.Filled.CowbellMore: ImageVector
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
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                close()
                moveTo(14.09f, 19.0f)
                lineTo(5.0f, 19.0f)
                curveToRelative(-1.19f, 0.0f, -2.31f, -0.52f, -3.07f, -1.43f)
                curveToRelative(-0.76f, -0.91f, -1.08f, -2.1f, -0.87f, -3.27f)
                lineToRelative(1.28f, -6.18f)
                curveToRelative(0.42f, -2.36f, 2.45f, -4.08f, 4.84f, -4.11f)
                curveToRelative(-0.11f, -0.32f, -0.19f, -0.65f, -0.19f, -1.01f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                curveToRelative(0.0f, 0.35f, -0.07f, 0.69f, -0.19f, 1.01f)
                curveToRelative(2.39f, 0.04f, 4.42f, 1.75f, 4.84f, 4.11f)
                lineToRelative(1.28f, 6.18f)
                curveToRelative(0.03f, 0.16f, 0.02f, 0.33f, 0.03f, 0.49f)
                curveToRelative(-0.88f, -0.5f, -1.89f, -0.79f, -2.97f, -0.79f)
                curveToRelative(-2.97f, 0.0f, -5.43f, 2.16f, -5.91f, 5.0f)
                close()
                moveTo(14.0f, 4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(8.14f, 21.0f)
                curveToRelative(0.45f, 1.72f, 2.0f, 3.0f, 3.86f, 3.0f)
                curveToRelative(1.07f, 0.0f, 2.02f, -0.43f, 2.74f, -1.12f)
                curveToRelative(-0.32f, -0.58f, -0.54f, -1.21f, -0.65f, -1.88f)
                horizontalLineToRelative(-5.95f)
                close()
            }
        }
        .build()
        return _cowbellMore!!
    }

private var _cowbellMore: ImageVector? = null
