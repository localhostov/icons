package me.localx.icons.straight.filled

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
                moveTo(21.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(16.43f, 15.18f)
                curveToRelative(1.73f, -1.28f, 3.97f, -1.5f, 5.89f, -0.69f)
                lineToRelative(-1.39f, -7.2f)
                curveToRelative(-0.34f, -1.91f, -2.0f, -3.3f, -3.94f, -3.3f)
                horizontalLineToRelative(-0.17f)
                curveToRelative(0.11f, -0.31f, 0.18f, -0.65f, 0.18f, -1.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                curveToRelative(0.0f, 0.35f, 0.07f, 0.69f, 0.18f, 1.0f)
                horizontalLineToRelative(-0.17f)
                curveToRelative(-1.94f, 0.0f, -3.6f, 1.39f, -3.94f, 3.3f)
                lineTo(0.81f, 19.0f)
                lineTo(14.1f, 19.0f)
                curveToRelative(0.25f, -1.47f, 1.04f, -2.86f, 2.33f, -3.82f)
                close()
                moveTo(9.0f, 3.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                close()
                moveTo(12.0f, 24.0f)
                curveToRelative(1.08f, 0.0f, 2.04f, -0.44f, 2.75f, -1.13f)
                curveToRelative(-0.33f, -0.59f, -0.54f, -1.23f, -0.65f, -1.87f)
                horizontalLineToRelative(-5.96f)
                curveToRelative(0.45f, 1.72f, 2.0f, 3.0f, 3.86f, 3.0f)
                close()
            }
        }
        .build()
        return _cowbellMore!!
    }

private var _cowbellMore: ImageVector? = null
