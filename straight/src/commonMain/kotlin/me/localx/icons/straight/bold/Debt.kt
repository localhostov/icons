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

public val Icons.Bold.Debt: ImageVector
    get() {
        if (_debt != null) {
            return _debt!!
        }
        _debt = Builder(name = "Debt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.202f, 7.079f)
                curveToRelative(-0.214f, -1.756f, -1.707f, -3.079f, -3.475f, -3.079f)
                horizontalLineToRelative(-4.739f)
                curveToRelative(0.316f, -0.419f, 0.511f, -0.934f, 0.511f, -1.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                curveToRelative(0.0f, 0.565f, 0.195f, 1.081f, 0.511f, 1.5f)
                horizontalLineToRelative(-4.739f)
                curveToRelative(-1.768f, 0.0f, -3.261f, 1.323f, -3.475f, 3.079f)
                lineTo(0.01f, 21.819f)
                lineTo(0.0f, 24.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-1.798f, -14.921f)
                close()
                moveTo(3.132f, 21.0f)
                lineToRelative(1.644f, -13.56f)
                curveToRelative(0.03f, -0.251f, 0.244f, -0.44f, 0.497f, -0.44f)
                horizontalLineToRelative(13.456f)
                curveToRelative(0.252f, 0.0f, 0.466f, 0.189f, 0.496f, 0.44f)
                lineToRelative(1.645f, 13.56f)
                lineTo(3.132f, 21.0f)
                close()
                moveTo(10.0f, 12.0f)
                curveToRelative(0.0f, 0.379f, 0.271f, 0.698f, 0.644f, 0.761f)
                lineToRelative(3.041f, 0.507f)
                curveToRelative(1.342f, 0.224f, 2.315f, 1.373f, 2.315f, 2.732f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.378f, -0.271f, -0.697f, -0.645f, -0.76f)
                lineToRelative(-3.041f, -0.507f)
                curveToRelative(-1.341f, -0.224f, -2.315f, -1.374f, -2.315f, -2.733f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _debt!!
    }

private var _debt: ImageVector? = null
