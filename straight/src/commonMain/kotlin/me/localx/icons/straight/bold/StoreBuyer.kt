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

public val Icons.Bold.StoreBuyer: ImageVector
    get() {
        if (_storeBuyer != null) {
            return _storeBuyer!!
        }
        _storeBuyer = Builder(name = "StoreBuyer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 14.949f)
                verticalLineToRelative(5.551f)
                curveToRelative(0.0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-7.206f)
                curveToRelative(-0.616f, -0.77f, -1.0f, -1.733f, -1.0f, -2.794f)
                lineToRelative(0.036f, -0.325f)
                lineTo(2.297f, 0.0f)
                horizontalLineToRelative(19.406f)
                lineToRelative(2.297f, 10.5f)
                curveToRelative(0.0f, 0.798f, -0.226f, 1.537f, -0.592f, 2.187f)
                curveToRelative(-0.537f, -1.021f, -1.398f, -1.846f, -2.469f, -2.296f)
                lineToRelative(-1.643f, -7.391f)
                horizontalLineToRelative(-2.297f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.297f)
                lineToRelative(-1.697f, 7.637f)
                curveToRelative(0.069f, 0.763f, 0.713f, 1.363f, 1.494f, 1.363f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.651f, 0.0f, 1.201f, -0.419f, 1.408f, -1.0f)
                horizontalLineToRelative(3.184f)
                curveToRelative(0.207f, 0.581f, 0.757f, 1.0f, 1.408f, 1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.651f, 0.0f, 1.201f, -0.419f, 1.408f, -1.0f)
                horizontalLineToRelative(2.12f)
                curveToRelative(-1.147f, 0.857f, -1.912f, 2.191f, -2.0f, 3.715f)
                curveToRelative(-0.479f, 0.175f, -0.99f, 0.285f, -1.529f, 0.285f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.157f, 0.0f, -2.202f, -0.451f, -3.0f, -1.17f)
                curveToRelative(-0.798f, 0.72f, -1.843f, 1.17f, -3.0f, 1.17f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.171f, 0.0f, -0.334f, -0.032f, -0.5f, -0.051f)
                close()
                moveTo(21.0f, 19.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(16.0f, 15.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _storeBuyer!!
    }

private var _storeBuyer: ImageVector? = null
